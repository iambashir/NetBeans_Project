package com.project.dao;

import com.project.common.ICommonDAO;
import com.project.model.Employee;
import com.project.util.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO implements ICommonDAO<Employee> {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    @Override
    public int save(Employee t) {
        try {
            String sql = "insert into employee(code, name, salary, address) values ('" + t.getEmployeeCode() + "','" + t.getEmployeeName() + "', '" + t.getSalary() + "', '" + t.getAddress() + "')";
            con = DBConnection.getConnection();
            stmt = con.createStatement();
            int status = stmt.executeUpdate(sql);
            
            
            con.close();
            return status;
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public Employee getByCode(String code) {
        try {
            String sql = "select * from employee where code = '" + code + "' ";
            con = DBConnection.getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            Employee e = new Employee();
            while (rs.next()) {
                e.setId(rs.getInt("id"));
                e.setEmployeeCode(rs.getString("code"));
                e.setEmployeeName(rs.getString("name"));
                e.setSalary(rs.getDouble("salary"));
                e.setAddress(rs.getString("address"));
            }
            con.close();
            return e;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public int update(Employee t) {
        try {
            String sql = "update employee set code = '" + t.getEmployeeCode() + "', name = '" + t.getEmployeeName() + "', salary = '" + t.getSalary() + "', address = '" + t.getAddress() + "' where id = '" + t.getId() + "' ";
            con = DBConnection.getConnection();
            stmt = con.createStatement();
            int status = stmt.executeUpdate(sql);
            con.close();
            return status;
        } catch (Exception ex) {
            return 0;
        }
    }

    @Override
    public int delete(String code) {
        String sql = "delete from employee where code = '" + code + "'";
        try {
            con = DBConnection.getConnection();
            stmt = con.createStatement();
            int status = stmt.executeUpdate(sql);
            con.close();
            return status;
        } catch (Exception e) {
            return 0;
        }
    }
    public List<Employee> getAll() {
        try {
            String sql = "select * from employee";
            con = DBConnection.getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            List<Employee> empList = new ArrayList<Employee>();
            while (rs.next()) {
                Employee e = new Employee();
                e.setId(rs.getInt("id"));
                e.setEmployeeCode(rs.getString("code"));
                e.setEmployeeName(rs.getString("name"));
                e.setSalary(rs.getDouble("salary"));
                e.setAddress(rs.getString("address"));
                System.out.println(e.getEmployeeName());
                empList.add(e);
            }
            con.close();
            return empList;
        } catch (Exception e) {
            return null;
        }
    }

}
