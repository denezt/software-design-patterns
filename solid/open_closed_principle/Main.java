public class Main {

	public static void main(String[] args){
		InsurancePremiumDiscountCalculator insurancePremiumDiscountCalculator = new InsurancePremiumDiscountCalculator();
    HealthInsuranceCustomerProfile healthInsuranceCustomerProfile = new HealthInsuranceCustomerProfile();
    System.out.println(insurancePremiumDiscountCalculator.calculatePremiumDiscountPercent(healthInsuranceCustomerProfile));
	}
}
