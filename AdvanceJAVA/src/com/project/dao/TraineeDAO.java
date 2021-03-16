package com.project.dao;

import com.project.common.ICommonDAO;
import com.project.model.Trainee;
import com.project.util.DBConnection;
import java.sql.*;
import java.util.List;

public class TraineeDAO implements ICommonDAO<Trainee> {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    @Override
    public int save(Trainee t) {
        try {
            
            String sql = "insert into trainee (code, name, batch, round) values(?,?,?,?)";
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getCode());
            ps.setInt(4, t.getRound());
            ps.setString(2, t.getName());
            ps.setString(3, t.getBatch());
            int status = ps.executeUpdate();
            con.close();
            return status;
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public Trainee getByCode(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Trainee t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Trainee> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
