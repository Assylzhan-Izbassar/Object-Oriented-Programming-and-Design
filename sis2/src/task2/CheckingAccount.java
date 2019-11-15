package task2;

public class CheckingAccount extends Account{

	private int counter;
	private static int freeTransactions=5;

	public CheckingAccount(int a) {
		super(a);
	}
	
	public int getCounter()
	{
		return this.counter;
	}
	
	
	public void transfer(double amount, Account other)
	{
		if(counter <= freeTransactions && freeTransactions > 0)
		{
			super.transfer(amount, other);
			freeTransactions--;
		}
		else
		{
			this.transferWithFee(amount, other);
		}
		this.counter++;
	}
	
	private void transferWithFee(double amount, Account other)
	{
		if(getBalance() >= amount)
		{
			withdraw(amount + deductFee(amount));
			other.deposit(amount);
			System.out.println("Transfer is completed!");
		}
		else
		{
			System.err.println("Sorry, you can not transfer this amount of money!");
		}
	}
	
	public void deductFee() {
		// -0.1
		if (counter < this.freeTransactions) {
			// ...
		} else {
			// ...
		}
		counter = 0;
	}
	
	public double deductFee(double amount)
	{
		return amount * 0.02;
	}
}
