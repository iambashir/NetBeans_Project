
package com.swing.service;
import com.swing.common.ICommonDao;
import com.swing.common.ICommonService;
import com.swing.dao.DbAccess;
import com.swing.model.SwingModel;
import java.util.List;

public class SwingService implements ICommonService<SwingModel> {

    
    ICommonDao employeeDAO = new EmployeeDAO();
    
    @Override
    public int save(SwingModel t) {
        SwingModel employee = getByCode(t.getName());
        if (t.getSalary() < 200) {
            return 3;
        }
        if (employee.getName() == null) {
            return employeeDAO.save(t);
        } else {
            return 0;
        } 
    }

    @Override
    public SwingModel getByCode(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(SwingModel t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SwingModel> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
//    //RECIEVED SwingModel VALUE from SwingController BY RecievedModelValue PARAMETER OF  addService METHOD
//    public void addService( SwingModel RecievedModelValue){
//    
//    DbAccess dao = new DbAccess();
//    //SEND RecievedModelValue DATA TO DbAccess CLASS
//    dao.swing(RecievedModelValue);
//    }

}
