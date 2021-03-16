package com.project.service;

import com.project.common.ICommonDAO;
import com.project.common.ICommonService;
import com.project.dao.EmployeeDAO;
import com.project.model.Employee;
import java.util.List;

public class EmployeeService implements ICommonService<Employee> {

    ICommonDAO employeeDAO = new EmployeeDAO();
    
    @Override
    public int save(Employee t) {
        Employee employee = getByCode(t.getEmployeeCode());
        if (t.getSalary() < 200) {
            return 3;
        }
        if (employee.getEmployeeCode() == null) {
            return employeeDAO.save(t);
        } else {
            return 0;
        }
    }

    @Override
    public Employee getByCode(String code) {
        return (Employee) employeeDAO.getByCode(code);
    }

    @Override
    public int update(Employee t) {
        return employeeDAO.update(t);
    }

    @Override
    public int delete(String code) {
        return employeeDAO.delete(code);
    }

    @Override
    public List<Employee> getAll() {
        return employeeDAO.getAll();
    }

}
