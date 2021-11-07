/**
* Reason to change
* 1. Changes in Employee Attributes
* 2. Changes in Database
* 3. Change in Tax Calculation
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Employee {
  private String employeeId;
  private String employeeName;
  private String employeeAddress;
  private String employeeNumber;
  private String employeeType;

  public void save(){
    // Serialize object into a string representation
    String objectStr = MyUtils.serializeToIntoAString(this);
    if (!objectStr.isEmpty()){
      Connection connection = null;
      Statement stmt = null;
      try {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB","root","password");
        stmt = connection.createStatement();
        stmt.execute("INSERT INTO STUDENT VALUES ("+ objectStr +")");
      } catch(Exception e) {
        e.printStackTrace();
      }
    }
  }

  public void calculateTax(){
    if (this.getEmployeeType().equals("fulltime")){
      // Tax calculation for full time employees
    }
    if (this.getEmployeeType().equals("contract")){
      // Tax calculation for contractors
    }
  }

  public String getEmployeeId(){
    return this.employeeId;
  }

  public void setEmployeeId(String employeeId){
    this.employeeId = employeeId;
  }

  public String getEmployeeName(){
    return this.employeeName;
  }

  public void setEmployeeName(String employeeName){
    this.employeeName = employeeName;
  }

  public String getEmployeeAddress(){
    return this.employeeAddress;
  }

  public void setEmployeeAddress(String employeeAddress){
    this.employeeAddress = employeeAddress;
  }

  public String getEmployeeNumber(){
    return this.employeeNumber;
  }

  public void setEmployeeNumber(String employeeNumber){
    this.employeeNumber = employeeNumber;
  }

  public String getEmployeeType(){
    return this.employeeType;
  }

  public void setEmployeeType(String employeeType){
    this.employeeType = employeeType;
  }
}
