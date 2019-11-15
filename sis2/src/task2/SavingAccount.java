package task2;

public class SavingAccount extends Account{

	private double interestRate;
	
	public SavingAccount(int a) {
		super(a);	
		interestRate = 0.01;
	}	
	
	public void addInterest()
	{
		deposit(getBalance() * interestRate);
	}
	public void setInterestRate(double interestRate)
	{
		this.interestRate = interestRate;
	}
	public double getInterestRate()
	{
		return this.interestRate;
	}
}
