
package com.swing.common;

import java.util.List;


public interface ICommonService <T> {
     public int save(T t);
    public T getByCode(String code);
    public int update(T t);
    public int delete(String code);
    public List<T> getAll();
    
}
