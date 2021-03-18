
package com.mtr.main.service;

import com.mtr.main.model.Honda;
import java.util.List;


public interface ICommonService<T> {

    public int save(T t);

    public Honda getHonda(String text);

    public boolean delete(String text);

    public int update(Honda h);

    public List<Honda> getAll();
    
}
