package services;

public class UsaInterestService implements InterestService {
	
	private double interestRate;
	

	public UsaInterestService(double interestRate) {
		this.interestRate = interestRate;
	}
	

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		return 1 + interestRate / 100;
	}

	@Override
	public double payment(double amount, int months) {
				
		return amount * Math.pow(getInterestRate(), months);
	}

}