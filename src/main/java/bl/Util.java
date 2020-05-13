package bl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
  private static final String DB_DRIVER = "org.h2.Driver";
  private static final String DB_URL = "jdbc:h2:~/test";
  private static final String DB_NAME = "sa";
  private static final String DB_PASS = "";

  public static Connection getConnection() {
    Connection conn = null;
    try {
      Class.forName(DB_DRIVER);
      conn = DriverManager.getConnection(DB_URL, DB_NAME, DB_PASS);
      System.out.println("Соединение установлено");
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
      System.out.println("Соединение не установлено");
    }

    return conn;
  }
}