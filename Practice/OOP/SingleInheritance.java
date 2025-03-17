package OOP;

class BankAccount 
{
	double balance;

	BankAccount(double balance) 
	{
		this.balance = balance;
	}

	void deposit(double amount) 
	{
		balance += amount;
		System.out.println("Deposited: " + amount);
	}

	void showBalance() 
	{
		System.out.println("Balance: " + balance);
	}
}

class SavingsAccount extends BankAccount 
{
	double interestRate;

	SavingsAccount(double balance, double interestRate) 
	{
		super(balance);  // Calls the parent class constructor
		this.interestRate = interestRate;
	}

	void addInterest() 
	{
		double interest = balance * interestRate / 100;
		balance += interest;
		System.out.println("Interest added: " + interest);
	}
}

public class SingleInheritance 
{
	public static void main(String[] args) 
	{
		SavingsAccount account = new SavingsAccount(1000.0, 5.0);

		account.deposit(500.0); 
		account.showBalance();   

		account.addInterest(); 
		account.showBalance();
	}
}




