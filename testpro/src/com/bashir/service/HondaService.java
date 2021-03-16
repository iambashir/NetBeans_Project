/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bashir.service;

import com.bashir.dao.HondaDAO;
import com.bashir.model.HondaModel;

/**
 *
 * @author Bashir
 */
public class HondaService {
    public void addEmployee(HondaModel US){
        HondaDAO dao = new HondaDAO();
        dao.empdao(US);
    }
}
