public class Main {

	public static void main(String[] args){
		InsurancePremiumDiscountCalculator insurancePremiumDiscountCalculator = new InsurancePremiumDiscountCalculator();

		System.out.println(insurancePremiumDiscountCalculator.calculatePremiumDiscountPercent(new HealthInsuranceCustomerProfile()));

		System.out.println(insurancePremiumDiscountCalculator.calculatePremiumDiscountPercent(new VehicleInsuranceCustomerProfile()));

		System.out.println(insurancePremiumDiscountCalculator.calculatePremiumDiscountPercent(new HomeInsuranceCustomerProfile()));
	}
}
