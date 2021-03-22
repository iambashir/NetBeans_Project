/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.common.honda.IHondaDAO;
import com.model.Honda;
import com.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HondaDAO implements IHondaDAO<Honda> {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    @Override
    public int save(Honda t) {

        try {

            String sql = "insert into trainee (code,name,model,engine,cc,gear) values(?,?,?,?,?,?)";
            con = DBConnection.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getCode());
            ps.setString(2, t.getName());
            ps.setString(3, t.getModel());
            ps.setString(4, t.getEngine());
            ps.setDouble(5, t.getCc());
            ps.setInt(6, t.getGear());
            int status = ps.executeUpdate();
            con.close();
            return status;
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public Honda getByCode(String t) {
        

        try {
            String sql = "select * from trainee where code = ?";
            con = DBConnection.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, t);
            rs =   ps.executeQuery();

            while (rs.next()) {
                Honda h = new Honda();
                h.setCode(rs.getString("code"));         
                h.setName(rs.getString("name"));
                h.setModel(rs.getString("model"));
                h.setEngine(rs.getString("engine"));
                h.setCc(rs.getDouble("cc"));
                h.setGear(rs.getInt("gear"));
                return h;
            }

        } catch (Exception e) {
            return null;
        }
        return null;

    }

    @Override
    public int update(Honda t) {
        
        try {
            String sql = "update trainee set code = ?, name = ?, model = ?, engine = ?, cc = ?, gear = ? where code = ?";
            con = DBConnection.getConn();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, t.getCode());
            ps.setString(2, t.getName());
            ps.setString(3, t.getModel());
            ps.setString(4, t.getEngine());
            ps.setDouble(5, t.getCc());
            ps.setInt(6, t.getGear());
            ps.setString(7, t.getCode());
            int status = ps.executeUpdate();
            con.close();
            return status;
        } catch (Exception e) {
        }
        return 0;

      
    }
    
 

    @Override
    public List<Honda> getAll() {
        try {
            String sql = "select * from trainee";
            con = DBConnection.getConn();
            ps = con.prepareStatement(sql); 
           rs = ps.executeQuery();
            List<Honda> list = new ArrayList<Honda>();
            while(rs.next()){
                Honda m = new Honda();
                m.setCode(rs.getString("code"));
                m.setName(rs.getString("name"));
                m.setModel(rs.getString("model"));
                m.setEngine(rs.getString("engine"));
                m.setCc(rs.getDouble("cc"));
                m.setGear(rs.getInt("gear"));
                list.add(m);
                
            }
           
            return list;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public int delete(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Honda m) {
        try {
              String sql = "delete from trainee where code = ?";
            con = DBConnection.getConn();
            ps = con.prepareStatement(sql); 
            ps.setString(1, m.getCode());
            return ps.executeUpdate();
            
        } catch (SQLException ex) {
          
        }
        return 0;
    }
    }

  

  