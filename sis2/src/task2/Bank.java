package task2;

import java.util.Vector;

public class Bank {
	
	private Vector<Account> accounts;
	
	public Bank()
	{
		accounts = new Vector<Account>();
	}
	
	public void update()
	{
		for(int i=0; i < accounts.size(); ++i)
		{
			if(accounts.elementAt(i) instanceof SavingAccount)
			{
				SavingAccount s = (SavingAccount)accounts.elementAt(i);
				s.addInterest();
			}
			else if(accounts.elementAt(i) instanceof CheckingAccount)
			{
				CheckingAccount c = (CheckingAccount)accounts.elementAt(i);
				c.withdraw(c.deductFee(c.getBalance()));
			}
		}
	}
	
	public void openAccount(Account newAccount)
	{
		accounts.add(newAccount);
	}
	
	public void closeAccount(Account account)
	{
		if(accounts.contains(account))//
		{
			accounts.remove(account);
		}
	}
	public Vector<Account> getAccounts()
	{
		return this.accounts;
	}
}
