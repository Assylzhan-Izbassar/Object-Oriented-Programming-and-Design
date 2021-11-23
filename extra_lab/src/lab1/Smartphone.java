package lab1;

import java.math.BigDecimal;

public class Smartphone implements Device {

	@Override
	public void withdraw(Account account, BigDecimal amount) {
		// TODO Auto-generated method stub
		account.credit(amount);
	}

	@Override
	public void deposit(Account account, BigDecimal amount) {
		// TODO Auto-generated method stub
		account.debit(amount);
	}
	
	@Override
	public void getBalance(Account account) {
		// TODO Auto-generated method stub
		account.getBalance();
	}

	@Override
	public void getStatement(Account account) {
		// TODO Auto-generated method stub
		account.getStatement();
	}
}
