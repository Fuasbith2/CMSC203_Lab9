
public class SavingsAccount extends BankAccount{
	private double rate = .025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	public SavingsAccount(SavingsAccount oldAccount, double amount) { // copy constructor
		super(oldAccount, amount);
		savingsNumber = oldAccount.savingsNumber + 1;
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public void postInterest() {		// calculates a month's interest and deposits in the balance
		double monthlyRate = rate/12;
		double interest = monthlyRate * getBalance();
		deposit(interest);
	}
	
	@Override
	public String getAccountNumber() {
		return accountNumber;
	}

}
