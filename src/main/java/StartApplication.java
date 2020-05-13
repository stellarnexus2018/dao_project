import Entity.Address;
import bl.Util;
import service.AddressService;

import java.sql.SQLException;

/**
 * Project entry point
 * @author Igor
 *
 */
public class StartApplication {

  public static void main(String[] args){

    //Util.getConnection();


    Address addr = new Address();
    addr.setId(1l);
    addr.setCity("Moscow");
    addr.setCountry("Russia");
    addr.setPostcode("115372");
    addr.setStreet("Biryulevskaya st.");

    AddressService as = new AddressService();

    try{
      as.add(addr);
    }catch (SQLException ex){ex.printStackTrace();}


    System.out.println();

  }





}
