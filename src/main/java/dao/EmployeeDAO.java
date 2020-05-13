package dao;

import Entity.Address;
import Entity.Employee;

import java.util.List;

public interface EmployeeDAO {
  void add(Employee addr);
  List<Employee> getAll();
  Employee getById(long id);
  void update(Employee addr);
  void remove(Employee addr);
}