package com.project.service;

import com.project.common.ICommonDAO;
import com.project.common.ICommonService;
import com.project.dao.TraineeDAO;
import com.project.model.Trainee;
import java.util.List;

public class TraineeService implements ICommonService<Trainee>{

    ICommonDAO traineeDAO = new TraineeDAO();
    
    @Override
    public int save(Trainee t) {
        return traineeDAO.save(t);
    }

    @Override
    public Trainee getByCode(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Trainee t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Trainee> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
