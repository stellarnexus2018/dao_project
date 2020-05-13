package dao;

import Entity.Address;

import java.sql.SQLException;
import java.util.List;

public interface AddressDAO {
  void add(Address addr) throws SQLException;
  List<Address> getAll();
  Address getById(long id);
  void update(Address addr);
  void remove(Address addr);
}