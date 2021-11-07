# Open Closed Principle - OCP

## Software components should be closed for modification, but open for extension.

### We start out with the following class

``` java
public class InsurancePremiumDiscountCalculator {

  public int calculatePremiumDiscountPercent(HealthInsuranceCustomerProfile customer){
    if (customer.isLoyalCustomer()){
      return 20;
    }
    return 0;
  }
}
```

### Next, we will define the 'HealthInsuranceCustomerProfile' class

``` java
public class HealthInsuranceCustomerProfile {

  public boolean isLoyalCustomer(){
    return true; // or false
  }
}
```

### Later, we will run into a problem if the company starts to support Vehicle Insurance.

``` java
public class VehicleInsuranceCustomerProfile {

  public boolean isLoyalCustomer(){
    return true; // or false
  }
}
```
### We will need to overload the method with another method which accept VehicleInsuranceCustomerProfile as an argument.

``` java
public class InsurancePremiumDiscountCalculator {

  public int calculatePremiumDiscountPercent(HealthInsuranceCustomerProfile customer){
    if (customer.isLoyalCustomer()){
      return 20;
    }
    return 0;
  }

  public int calculatePremiumDiscountPercent(VehicleInsuranceCustomerProfile customer){
    if (customer.isLoyalCustomer()){
      return 20;
    }
    return 0;
  }
}
```

### This will soon become a problem if the company start to support Home InsurancePremiumDiscountCalculator.

* We can solve this by creating an Interface class and have every addition component implement the interface.

``` java
public interface CustomerProfile {
  public boolean isLoyalCustomer();
}
```

### Is an example of the Open-Closed Principle.

* The Open-Closed Principle has the following benefits to software design:
  1. Ease of adding new features
  2. Leads to minimal cost of developing and testing software.
  3. The Open-Closed Principle often requires decoupling, which, in turn, automatically follows the Single Responisibility Principle.

* The Open-Closed Principle has the following drawbacks to software design:
  1. Do not follow the Open-Closed Principle blindly.
  2. You will end up with a huge number of classes that can complicate your overall design.
  3. Make a subjective, rather than an objective decision. Applying only the OCP when it benefits the software design.
