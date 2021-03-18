package com.mtr.main.serviceImpl;

import com.mtr.main.model.Data;
import com.mtr.main.model.Employee;
import com.mtr.main.service.DataService;
import com.mtr.util.SqlConnection;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DataServiceImpl implements DataService {

    private Data data = new Data();

    @Override
    public void saveEmployee(Employee employee) {
        try {
            Connection con = SqlConnection.connection();
            PreparedStatement ps = null;
            ps = (PreparedStatement) con.prepareStatement("insert into  employees (code, name, address, salary) values (?, ?, ?, ?)");
            ps.setInt(1, employee.getCode());
            ps.setString(2, employee.getName());
            ps.setString(3, employee.getAddress());
            ps.setDouble(4, employee.getSalary());

            String query = "select code from employees where code=" + employee.getCode();
            Statement stmt = (Statement) SqlConnection.connection().createStatement();
            ResultSet rs = (ResultSet) stmt.executeQuery(query);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "code  already exists, choose another");
            } else {
                int data = (int) ps.executeUpdate();

                if (data == 1) {
                    JOptionPane.showMessageDialog(null, "data inserted");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void save(Data data) {
        try {
            FileWriter writer = new FileWriter("demo.txt", true);
            writer.append(data.getName() + " " + data.getEmail() + " " + data.getAddress() + " " + data.getMobile());

            writer.write("\r\n");

            writer.close();
            System.out.println("done writing data");
        } catch (IOException ex) {
            Logger.getLogger(DataServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Data getData() throws FileNotFoundException, IOException {
        File myObj = new File("demo.txt");
        Scanner myReader = new Scanner(myObj);
        String input = null;
        while (myReader.hasNextLine()) {
            input = myReader.nextLine();
        }
        myReader.close();

        String[] newdata = input.split(" ");
        data.setName(newdata[0]);
        data.setEmail(newdata[1]);
        data.setAddress(newdata[2]);
        data.setMobile(newdata[3]);

        return data;
    }

    public Employee getEmployee(int code) {
        Employee emp = new Employee();
        try {
            String query = "select * from employees where code=" + code;
            Statement stmt = (Statement) SqlConnection.connection().createStatement();
            ResultSet rs = (ResultSet) stmt.executeQuery(query);
            if (rs.next()) {
                emp.setId(rs.getInt("id"));
                emp.setCode(rs.getInt("code"));
                emp.setName(rs.getString("name"));
                emp.setAddress(rs.getString("address"));
                emp.setSalary(rs.getDouble("salary"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return emp;
    }

    public void updateEmployee(Employee emp) {
        try {
            Connection con = SqlConnection.connection();

            String query = "update employees set name=?, address=?, salary=? where id=" + emp.getId();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, emp.getName());
            ps.setString(2, emp.getAddress());
            ps.setDouble(3, emp.getSalary());

            int data = ps.executeUpdate();

            if (data == 1) {
                JOptionPane.showMessageDialog(null, "data updated");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Employee> getAll() throws SQLException {
        Employee emp;
        List<Employee> e = new ArrayList<>();
        String query = "select * from employees";
        Statement stmt = (Statement) SqlConnection.connection().createStatement();
        ResultSet rs = (ResultSet) stmt.executeQuery(query);
        //using a loop to set all data to table
        while (rs.next()) {
            emp = new Employee();
            emp.setCode(rs.getInt("code"));
            emp.setName(rs.getString("name"));
            emp.setAddress(rs.getString("address"));
            emp.setSalary(rs.getDouble("salary"));

            e.add(emp);
        }

        return e;
    }

    public void delteEmployee(int code) throws SQLException {
        String query = "select code from employees where code=" + code;
        Statement stmt = (Statement) SqlConnection.connection().createStatement();
        ResultSet rs = (ResultSet) stmt.executeQuery(query);
        if (rs.next()) {
            String queryDelete = "delete from employees where code=" + code;
            Statement stmt2 = (Statement) SqlConnection.connection().createStatement();
            int value = JOptionPane.showConfirmDialog(null, "Worning!!!\nAfter deleting data can not be revert back", "Warning!", JOptionPane.YES_NO_OPTION);
            if (value == 0) {
                stmt2.executeUpdate(queryDelete);
            }
        } else {
            JOptionPane.showMessageDialog(null, "data does not exists by this code " + code);
        }

    }

}
