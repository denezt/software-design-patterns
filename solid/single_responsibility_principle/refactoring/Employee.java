public class Employee {
  private String employeeId;
  private String employeeName;
  private String employeeAddress;
  private String employeeNumber;
  private String employeeType;

  public void save(){
    new EmployeeRepository().save(this);
  }

  public void calculateTax(){
    new TaxCalculator().calculateTax(this);
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
