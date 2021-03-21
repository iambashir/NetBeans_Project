package dao;

import common.ICommonDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Role;
import util.DbConnection;

public class RoleDao implements ICommonDao {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public int save(Role r) {
        try {
            String insertQuery = "insert into role(role_name, role_code, role_desc)values(?,?,?)";
            con = DbConnection.getConnection();
            ps = con.prepareStatement(insertQuery);
            ps.setString(2, r.getRole_code());
            ps.setString(1, r.getRole_name());
            ps.setString(3, r.getRole_desc());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }
    }

    @Override
    public int update(Role r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Role getAll(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
