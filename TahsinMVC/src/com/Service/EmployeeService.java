package com.Service;

import com.Dao.DAO;
import com.Model.User;
import java.util.List;

public class EmployeeService {

    public void addEmployee(User U) {
        DAO dao = new DAO();
        dao.empDao(U);
    }

    public User editEmployee(String ncode) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        DAO dao = new DAO();
        User u = dao.empDaoEdit(ncode);
        return u;
    }

    public void DeleteEmployee(User U) {
        DAO dao = new DAO();
        dao.empDaoDelete(U);
    }

    public int updateDao(User U) {
        DAO dao = new DAO();
        dao.empDaoUpdate(U);
        return 1;
    }

    public List<User> getAll() {
        DAO dao = new DAO();
        return dao.getAll();

    }
}
