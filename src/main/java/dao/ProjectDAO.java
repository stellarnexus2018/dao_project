package dao;

import Entity.Project;
import java.util.List;

public interface ProjectDAO {
  void add(Project addr);
  List<Project> getAll();
  Project getById(long id);
  void update(Project addr);
  void remove(Project addr);
}