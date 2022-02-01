package services;

public class BrazilInterestService implements InterestService {
	
	private double interestRate;
	
	
	public BrazilInterestService(double interestRate) {
		this.interestRate = 2.0;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}
	

}
