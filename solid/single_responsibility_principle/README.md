# Single Responsibility Principle - SRP

## Cohension
* Cohension - is the degree to which the various parts of a software component are related.
  * Aim for High Cohesion
* Coupling - is defined as the level of inter dependency between various software components.
  * Aim for Loose Coupling

### We can create an EmployeeRepository Component and place the save method within it.

``` java
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
```

### We can create a TaxCalculator Component and place the calculateTax method within it.

``` java
public void calculateTax(){
  if (this.getEmployeeType().equals("fulltime")){
    // Tax calculation for full time employees
  }
  if (this.getEmployeeType().equals("contract")){
    // Tax calculation for contractors
  }
}
```

* When we refactor the Employee Class we can ensure that the component has one responsibility or reason to change.
