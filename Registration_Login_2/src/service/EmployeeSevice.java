package service;

import common.IEmplooyeeService;
import dao.EmployeeDao;
import model.Employee;



public class EmployeeSevice implements IEmplooyeeService{

    @Override
    public int save(Employee e) {
        return new EmployeeDao().save(e);
    }

    @Override
    public int update(Employee e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee getAll(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int login(Employee e) {
        return new EmployeeDao().login(e);
    }
}
