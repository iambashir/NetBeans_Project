/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.service;

import com.test.dao.MobileDAO;
import com.test.interfaces.ICommonDAO;
import com.test.interfaces.ICommonService;
import com.test.models.Regmobile;
import java.util.List;

/**
 *
 * @author Hiccup 62
 */
public class MobileService implements ICommonService<Regmobile>{
    ICommonDAO mobiledao = new MobileDAO();

    @Override
    public int save(Regmobile t) {
        //throw new UnsupportedOperationException("Not supported yet.");
        return mobiledao.save(t);
    }
        //

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
