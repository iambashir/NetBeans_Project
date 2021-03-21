package common;

import model.Employee;


public interface IEmplooyeeService <T>{
    public int save(Employee e);
    public int update(Employee e);
    public int delete(String s);
    public Employee getAll(String s);
    public int login(Employee e);
}
