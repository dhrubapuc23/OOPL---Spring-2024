package practiceB2;

 class BankAccount{
	double balance = 0.0;
	
	double deposit(double amount)
	{
		balance = balance + amount;
		return balance;
	}
	
	void withdraw(double amount)
	{
		balance = balance - amount;
		
	}
}

class SavingsAccount extends BankAccount{
	
	void withdraw(double amount)
	{
		if(balance > 100 && balance >= amount)
		{
			balance = balance - amount;
			System.out.println("After withdraw, total amount is: "+balance);
		}
		else
		{
			System.out.println("Insufficient Amount!");
		}
	}
	
	void status()
	{
		System.out.println("Total amount: "+balance);
	}
	
}

public class Bank {

	public static void main(String[] args) {
		SavingsAccount obj = new SavingsAccount();
		obj.deposit(1000);
		obj.status();
		obj.withdraw(500);
		obj.withdraw(400);
		obj.deposit(1000);
		obj.status();
		obj.withdraw(50);
	}

}
