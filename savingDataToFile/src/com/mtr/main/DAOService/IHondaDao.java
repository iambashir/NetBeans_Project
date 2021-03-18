package com.mtr.main.DAOService;

import com.mtr.main.model.Honda;
import java.util.List;

public interface IHondaDao<T> {

    public int save(Honda t);

    public Honda getHonda(String text);

    public boolean delete(String text);

    public int update(Honda h);

    public List<Honda> getAll();
    
}
