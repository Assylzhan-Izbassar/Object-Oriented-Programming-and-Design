package task2;

public class Account extends Object {
	
	private double balance;
	private int accNumber;
	
	public Account(int a)
	{
		balance = 0.0;
		accNumber = a;
	}
	
	public void deposit(double sum)
	{
		balance += sum;
	}
	
	public void withdraw(double sum)
	{
		if(this.balance >= sum)
		{
			this.balance -= sum;
			System.out.println("Withdraw is done!");
		}
		else
		{
			System.err.println("Sorry, you have not enough money for withdraw!");
		}
	}
	
	public double getBalance()
	{
		return this.balance;
	}
	
	public int getAccountNumber()
	{
		return this.accNumber;
	}
	
	public void transfer(double amount, Account other)
	{
		withdraw(amount); //
		other.deposit(amount);
	}
	
	public String toString()
	{
		return "Your balance is " + this.balance + ". " + "Your account number is " 
				+ this.accNumber + ".";
	}
	
	public final void print()
	{
		System.out.println(toString());
	}
	
	public boolean equals(Object o)
	{
		if(this == o)return true;
		if(o.getClass() != this.getClass() || o == null)return false;
		
		Account temp = (Account)o;
		
		return this.getBalance() > temp.getBalance() || this.getAccountNumber() > temp.getAccountNumber();
	}
}
