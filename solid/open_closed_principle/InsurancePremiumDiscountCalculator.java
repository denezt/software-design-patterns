public class InsurancePremiumDiscountCalculator {

  public int calculatePremiumDiscountPercent(HealthInsuranceCustomerProfile customer){
    if (customer.isLoyalCustomer()){
      return 20;
    }
    return 0;
  }
}
