/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.common.honda.IHondaDAO;
import com.common.honda.IHondaSarvice;
import com.dao.HondaDAO;
import com.model.Honda;
import java.util.List;

public class HondaSarvice implements IHondaSarvice<Honda> {

    IHondaDAO dao = (IHondaDAO) new HondaDAO();

    @Override
    public int save(Honda t) {
        return dao.save(t);

    }

    @Override
    public Honda getByCode(String t) {
        return (Honda) dao.getByCode(t);

    }

    @Override
    public int update(Honda t) {
       return dao.update(t);
    }

    @Override
    public List<Honda> getAll() {
       return new HondaDAO().getAll();
    }

    @Override
    public int delete(Honda m) {
      return dao.delete(m);
    }

    @Override
    public int delete(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
