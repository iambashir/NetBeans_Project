package com.mtr.main.DAO;

import com.mtr.main.DAOService.IHondaDao;
import com.mtr.main.model.Honda;
import com.mtr.util.SqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class HondaDaoImpl implements IHondaDao<Honda> {

    private Honda honda;

    @Override
    public int save(Honda t) {
        int flag = -1;
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = SqlConnection.connection();
            ps = (PreparedStatement) con.prepareStatement("insert into  vechile (code, name, model, engine, CC, gear) values (?, ?, ?, ?, ? , ?)");
            ps.setString(1, t.getCode());
            ps.setString(2, t.getName());
            ps.setString(3, t.getModel());
            ps.setString(4, t.getEngine());
            ps.setDouble(5, t.getCc());
            ps.setInt(6, t.getGear());

            //String query = "select code from employees where code=" + employee.getCode();
            //Statement stmt = (Statement) SqlConnection.connection().createStatement();
            // ResultSet rs = (ResultSet) stmt.executeQuery(query);
            flag = ps.executeUpdate();
            if (flag == 1) {
                JOptionPane.showMessageDialog(null, "data inserted");
            } else {
                JOptionPane.showMessageDialog(null, "error");
            }

            con.close();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return flag;
    }

    @Override
    public Honda getHonda(String text) {
        honda = new Honda();
        try {
            String query = "select * from vechile where code= " + text;
            Statement stmt = (Statement) SqlConnection.connection().createStatement();
            ResultSet rs = (ResultSet) stmt.executeQuery(query);
            if (rs.next()) {
                honda.setId(rs.getInt("id"));
                honda.setCode(rs.getString("code"));
                honda.setName(rs.getString("name"));
                honda.setModel(rs.getString("model"));
                honda.setEngine(rs.getString("engine"));
                honda.setCc(rs.getDouble("CC"));
                honda.setGear(rs.getInt("gear"));
            } else {
                JOptionPane.showMessageDialog(null, "data not found by search text");
            }

            stmt.close();
            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return honda;
    }

    @Override
    public boolean delete(String code) {
        boolean flag = false;
        if (code != null && !code.isEmpty()) {
            try {
                String query = "select code from vechile where code=" + code;
                Statement stmt = (Statement) SqlConnection.connection().createStatement();
                ResultSet rs = (ResultSet) stmt.executeQuery(query);
                if (rs.next()) {
                    String queryDelete = "delete from vechile where code=" + code;
                    Statement stmt2 = (Statement) SqlConnection.connection().createStatement();
                    int value = JOptionPane.showConfirmDialog(null, "Worning!!!\nAfter deleting data can not be revert back", "Warning!", JOptionPane.YES_NO_OPTION);
                    if (value == 0) {
                        stmt2.executeUpdate(queryDelete);
                        flag = true;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "data does not exists by this code " + code);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            JOptionPane.showMessageDialog(null, "to delete, first get value using edit");
        }

        return flag;
    }

    @Override
    public int update(Honda h) {
        int data = 0;
        
        try {
            Connection con = SqlConnection.connection();

            String query = "update vechile set code=?, name=?, model=?, engine=?, CC=?, gear=? where id=" + h.getId();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, h.getCode());
            ps.setString(2, h.getName());
            ps.setString(3, h.getModel());
            ps.setString(4, h.getEngine());
            ps.setDouble(5, h.getCc());
            ps.setInt(6, h.getGear());

            data = ps.executeUpdate();

            if (data == 1) {
                JOptionPane.showMessageDialog(null, "data updated");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    @Override
    public List<Honda> getAll() {
        List<Honda> h = new ArrayList<>();
        try {
            String query = "select * from vechile";
            Statement stmt = (Statement) SqlConnection.connection().createStatement();
            ResultSet rs = (ResultSet) stmt.executeQuery(query);
            //using a loop to set all data to table
            while (rs.next()) {
                honda = new Honda();
                honda.setCode(rs.getString("code"));
                honda.setName(rs.getString("name"));
                honda.setModel(rs.getString("model"));
                honda.setEngine(rs.getString("engine"));
                honda.setCc(rs.getDouble("CC"));
                honda.setGear(rs.getInt("gear"));

                h.add(honda);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return h;
    }

}
