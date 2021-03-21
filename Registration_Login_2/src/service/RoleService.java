package service;

import common.ICommonService;
import dao.RoleDao;
import model.Role;

public class RoleService implements ICommonService<Object> {

    @Override
    public int save(Role r) {
        return new RoleDao().save(r);
    }

    @Override
    public int update(Role r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Role getAll(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
