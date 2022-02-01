package application;

import java.util.Locale;

import services.BrazilInterestService;
import services.InterestService;
import services.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		InterestService service = new BrazilInterestService(2.0);
		
	    double amount = 200.0;
		int month = 3;
		
		double payment = service.payment(amount, month);
		
		System.out.println("Amount: " + String.format("%.2f", amount));
		System.out.println("Months: " + month);
		System.out.println("Payment after 3 months:");
		System.out.println(String.format("%.2f", payment));
	
	}

}
