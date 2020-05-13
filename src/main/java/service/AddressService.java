package service;

import Entity.Address;
import bl.Util;
import dao.AddressDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class AddressService implements AddressDAO {

  Connection conn = Util.getConnection();

  @Override
  public void add(Address addr) throws SQLException {
    String sql = "INSERT INTO PUBLIC.ADDRESS (ID, COUNTRY, CITY, STREET, POST_CODE) VALUES (?,?,?,?,?)";
    PreparedStatement ps = null;

    try{
      ps = conn.prepareStatement(sql);
      ps.setLong(1, addr.getId());
      ps.setString(2, addr.getCountry());
      ps.setString(3, addr.getCity());
      ps.setString(4, addr.getStreet());
      ps.setString(5, addr.getPostcode());

      ps.executeUpdate();
    }catch (SQLException sex){
      sex.printStackTrace();
    }finally {
      if(ps!=null){
        ps.close();
      }
      if (conn!=null){
        conn.close();
      }
    }
  }

  @Override
  public List<Address> getAll() {
    return null;
  }

  @Override
  public Address getById(long id) {
    return null;
  }

  @Override
  public void update(Address addr) {

  }

  @Override
  public void remove(Address addr) {

  }
}