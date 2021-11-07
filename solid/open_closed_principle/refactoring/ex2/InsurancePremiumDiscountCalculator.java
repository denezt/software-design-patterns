public class InsurancePremiumDiscountCalculator {

  public int calculatePremiumDiscountPercent(CustomerProfile customer){
    if (customer.isLoyalCustomer()){
      return 20;
    }
    return 0;
  }
}
