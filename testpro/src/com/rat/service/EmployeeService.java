/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rat.service;

import com.rat.dao.DAO;
import com.rat.model.User;

/**
 *
 * @author Hiccup
 */
public class EmployeeService {
    public void addEmployee(User US){
        DAO dao = new DAO();
        dao.empdao(US);
    }
}
