/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.common;

import java.util.List;

/**
 *
 * @author Faculty Pc
 */
public interface ICommonDAO<T> {
    public int save(T t);
    public T getByCode(String code);
    public int update(T t);
    public int delete(String code);
    public List<T> getAll();
}
