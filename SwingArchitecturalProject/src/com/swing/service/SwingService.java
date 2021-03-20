
package com.swing.service;

import com.swing.dao.DbAccess;
import com.swing.model.SwingModel;

public class SwingService {
    
    //RECIEVED SwingModel VALUE from SwingController BY RecievedModelValue PARAMETER OF  addService METHOD
    public void addService( SwingModel RecievedModelValue){
    
    DbAccess dao = new DbAccess();
    //SEND RecievedModelValue DATA TO DbAccess CLASS
    dao.swing(RecievedModelValue);
    
    
    }

}
