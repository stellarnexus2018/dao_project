package Entity;

import java.sql.Date;

public class Employee {
  private long id;
  private String firstName;
  private String lastName;
  private Date birthDate;
  private long addressID;

  public Employee() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public long getAddressID() {
    return addressID;
  }

  public void setAddressID(long addressID) {
    this.addressID = addressID;
  }
}
