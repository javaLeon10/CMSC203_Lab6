
public class CheckingAccount extends BankAccount {

	final static double FEE = 0.15;
	
	public CheckingAccount() {
		// TODO Auto-generated constructor stub
	}

	public CheckingAccount(String name, double amount) {
		super(name, amount);
		
		setAccountNumber(getAccountNumber() + "-10");
		
		//System.out.println("Our CA string is "+getAccountNumber());
		
		
	}
	
	public boolean withdraw (double amount) {
		boolean completed = true;

		if (amount <= (getBalance()-FEE))
		{
			setBalance(getBalance() - (amount+FEE));
		}
		else
		{
			completed = false;
		}
		return completed;
	}

	public CheckingAccount(BankAccount oldAccount, double amount) {
		super(oldAccount, amount);
		// TODO Auto-generated constructor stub
	}

}
