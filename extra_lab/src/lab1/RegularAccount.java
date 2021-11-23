package lab1;

import java.math.BigDecimal;

public class RegularAccount extends Account {
	
	public RegularAccount(String number, String status, Client owner, BigDecimal balance) {
		super(number, status, owner, balance);
	}

	@Override
	public void debit(BigDecimal amount) {
		BigDecimal newBalance = balance.subtract(amount);

		if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("balance can not be negative");
		}

		newBalance = newBalance.subtract(new BigDecimal("30.00"));

		if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("balance can not be negative");
		}

		balance = newBalance;

		operations[opIndex] = "Debit " + amount.toString();
		opIndex++;
	}
	
	
	@Override
	public void credit(BigDecimal amount) {
		balance = balance.add(amount);
		operations[opIndex] = "Credit for regular account " + amount.toString();
		opIndex++;
	}
	
	@Override
	public void paymentForService() {
		balance = balance.subtract(new BigDecimal("2300.00"));
	}
	
	@Override
	protected String balanceBuilder() {
		return "Your regular account balance is " + balance.toString();
	}
}