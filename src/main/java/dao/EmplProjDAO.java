package dao;

import Entity.EmpProj;
import java.util.List;

public interface EmplProjDAO {
  void add(EmpProj addr);
  List<EmpProj> getAll();
  EmpProj getById(long empl_id, long proj_id);
  void update(EmpProj addr);
  void remove(EmpProj addr);
}