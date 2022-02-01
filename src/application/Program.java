package application;

import services.BrazilInterestService;
import services.InterestService;

public class Program {

	public static void main(String[] args) {
		
		InterestService service = new BrazilInterestService(2.0);
		
	    double amount = 200.0;
		int month = 3;
		
		
		
		System.out.println("Amount: " + String.format("%.2f", amount));
		System.out.println("Months: " + month);
		System.out.println("Payment after 3 months:");
		System.out.println(String.format("%.2f", service.payment(amount, month)));
		
		
		
		
		
	
	}

}
