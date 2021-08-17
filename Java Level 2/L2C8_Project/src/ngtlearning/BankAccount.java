package ngtlearning;

public class BankAccount {

	private double accountBalance;
	private String accountHoldersPhone;
	
	public BankAccount(){ //constructor 1
		accountBalance = 0;
		accountHoldersPhone = null;
	}
	public BankAccount(double balance){ //constructor 2
		accountBalance = balance;
		accountHoldersPhone = null;
	}
	public BankAccount(double balance, String phone){ //constructor 3
		accountBalance = balance;
		accountHoldersPhone = phone;
	}
	public double getBalance(){
		return accountBalance;
	}
	public String getPhone(){
		return accountHoldersPhone;
	}

}
