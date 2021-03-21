package dao;

import common.IEmployeeDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Employee;
import util.DbConnection;

public class EmployeeDao implements IEmployeeDao {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public int save(Employee e) {
        try {
            String insertQuery = "insert into employees(employee_name, employee_email, employee_user_name, employee_code, employee_role,employee_password)values(?,?,?,?,?,?)";
            con = DbConnection.getConnection();
            ps = con.prepareStatement(insertQuery);
            ps.setString(1, e.getEmp_name());
            ps.setString(2, e.getEmp_email());
            ps.setString(3, e.getEmp_userName());
            ps.setString(4, e.getEmp_password());
            ps.setString(5, e.getRole_name());
            ps.setString(6, e.getEmp_password());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }
    }

    @Override
    public int update(Employee e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee getAll(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int login(Employee e) {
        try {
            String selectQ = "select * from employees where employee_role = ? and employee_user_name = ? and employee_password = ?";
            con = DbConnection.getConnection();
            ps = con.prepareStatement(selectQ);
            ps.setString(1, e.getRole_name());
            ps.setString(2, e.getEmp_userName());
            ps.setString(3, e.getEmp_password());
            rs = ps.executeQuery();
            if (rs.next()) {
               return 1; 
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }
    }

}
