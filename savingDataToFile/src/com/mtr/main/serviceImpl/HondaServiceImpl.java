
package com.mtr.main.serviceImpl;

import com.mtr.main.DAO.HondaDaoImpl;
import com.mtr.main.DAOService.IHondaDao;
import com.mtr.main.model.Honda;
import com.mtr.main.service.ICommonService;
import java.util.List;

public class HondaServiceImpl implements ICommonService<Honda>{
    private IHondaDao hondaDao = new HondaDaoImpl();

    @Override
    public int save(Honda t) {
        return hondaDao.save(t);
    }

    @Override
    public Honda getHonda(String text) {
        return hondaDao.getHonda(text);
    }

    @Override
    public boolean delete(String text) {
        return hondaDao.delete(text);
    }

    @Override
    public int update(Honda h) {
        return hondaDao.update(h);
    }

    @Override
    public List<Honda> getAll() {
        return hondaDao.getAll();
    }

    
}
