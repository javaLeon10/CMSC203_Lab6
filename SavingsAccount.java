
public class SavingsAccount extends BankAccount {

	private double rate = 0.025;
	private static int savingsNumber = 0;
	private static String AccountNumber;
	
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(String name, double amount) {
		super(name, amount);
		
		AccountNumber = getAccountNumber();
		setAccountNumber(getAccountNumber() + "-"+ Integer.toString(savingsNumber));
		
	}
	
	public void postInterest() {
		setBalance(getBalance() + getBalance()*rate/12);
	}
	
	
	public SavingsAccount(BankAccount oldAccount, double amount) {
		super(oldAccount, amount);
		String [] tmp = getAccountNumber().split("-");
		savingsNumber++;
		
		setAccountNumber(tmp[0] + "-"+ Integer.toString(savingsNumber));
		
		
	}

}
