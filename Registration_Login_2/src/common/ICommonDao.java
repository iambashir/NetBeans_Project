package common;

import model.Role;

public interface ICommonDao <T>{
 public int save(Role r);
    public int update(Role r);
    public int delete(String s);
    public Role getAll(String s);
}
