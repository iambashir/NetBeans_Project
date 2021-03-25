/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.dao;

import com.test.interfaces.ICommonDAO;
import com.test.models.Regmobile;
import com.test.util.DBConnection;
import java.sql.*;
import java.util.List;

/**
 *
 * @author Hiccup 62
 */
public class MobileDAO implements ICommonDAO<Regmobile>{
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    @Override
    public int save(Regmobile t) {
        try {
            
            String sql = "insert into mobilereg (code, model, ram, processor) values(?,?,?,?)";
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getCode());
            ps.setString(2, t.getModel());
            ps.setInt(3, t.getRam());
            ps.setString(4, t.getProcessor());
            int status = ps.executeUpdate();
            con.close();
            return status;
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public Regmobile getByCode(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Regmobile t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Regmobile> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
