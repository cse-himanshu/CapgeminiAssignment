package test_bank;

public class AccountService {
	private static final int minBalance = 1000;
	private Account account;
	
	public AccountService() {
		account = new Account(895859403, "Adam", 3000);
	}
	
	public double deposit(double amount) {
		if(amount > 0){
			account.setCurrentBalance(account.getCurrentBalance() + amount);	
		}
		return account.getCurrentBalance();
	}
	
	public boolean minBalanceCondition(double amount) {
		return (account.getCurrentBalance() - amount) >= minBalance;
	}
	
	public double withdraw(double amount) {
		double balance = account.getCurrentBalance();
		if(amount <= balance && minBalanceCondition(amount)) {
			account.setCurrentBalance(balance - amount);
		}
		return account.getCurrentBalance();
	}	
}
