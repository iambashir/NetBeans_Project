
package com.grocery.app.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import com.grocery.app.model.Item;
/**
 *
 * @author HaShaN
 */
public interface ItemController{
    public boolean addItem(Item item) throws ClassNotFoundException,SQLException;
    public boolean deleteItem(String code) throws ClassNotFoundException,SQLException;
    public boolean updateItem(Item item) throws ClassNotFoundException,SQLException;
    public int updateItemQTY(String icode,int qty)throws ClassNotFoundException,SQLException;
    public Item searchItem(String code) throws ClassNotFoundException,SQLException;
    public ArrayList<Item> getAllItems() throws ClassNotFoundException,SQLException;
}
