package ngtlearning;

public class User {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		BankAccount johnBankAccount = new BankAccount();
		System.out.println("Account balance for John "+johnBankAccount.getBalance());
		System.out.println("Phone Number for John "+johnBankAccount.getPhone());
		
		BankAccount jackBankAccount = new BankAccount(10000);
		System.out.println("Account balance for Jack "+jackBankAccount.getBalance());
		System.out.println("Phone Number for Jack "+jackBankAccount.getPhone());
		
		BankAccount janeBankAccount = new BankAccount(5000, "925-111-2222");
		System.out.println("Account balance for Jane "+janeBankAccount.getBalance());
		System.out.println("Phone Number for Jane "+janeBankAccount.getPhone());
		
	}
}
