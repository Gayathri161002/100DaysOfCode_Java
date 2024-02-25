/*
There are three types of Bank accounts. Savings, RD and Fixed.  In these accounts one can do deposit.  
But withdrawn can only be done in savings account only.
The other two accounts withdrawal can be done after certain period only. 
The number of periods should be passed as parameter for the account types 
except savings account.  If the time period is same then withdrawal can be done.  
Otherwise denied message should come for the customer.  
But for the three accounts you can check balance clearly.  
Write corresponding methods and create classes - Implement method overloading concept
*/

package javaPrograms;

class BankAccount
{
	int balance;
	
	public BankAccount(int balance)
	{
		this.balance = balance;
	}
	
	void deposit(int amount) { }
	
	void withdrawal(int period,int amount) { }
	
	void checkBalance() { }
	
}

class SavingsAccount extends BankAccount
{

	public SavingsAccount(int balance)
	{
		super(balance);
	}
	
	void deposit(int amount)
	{
		System.out.println("Before deposit Balance : " + balance);
		System.out.println("Deposit amount : " + amount);
		balance += amount;
		System.out.println("After deposit Balance : " + balance);
	}
	
	void withdrawal(int amount)
	{
		System.out.println("You can withdraw " + amount);
		balance -= amount;
		System.out.println("Balance After withdrawal : " + balance);
	}
	
	void checkBalance()
	{
		System.out.println("Balance : " + balance);
	}
    
}

class RDAccount extends BankAccount
{
    int fixedPeriod = 5;
	
	public RDAccount(int balance) 
	{
		super(balance);
	}
	
	void deposit(int amount)
	{
		System.out.println("Before deposit Balance : " + balance);
		System.out.println("Deposit amount : " + amount);
		balance += amount;
		System.out.println("After deposit Balance : " + balance);
	}
	
	void withdrawal(int period, int amount)
	{
		if(period > fixedPeriod)
		{
			System.out.println("You can withdraw " + amount);
			balance -= amount;
			System.out.println("Balance After withdrawal : " + balance);
		}
		else
		{
			System.out.println("Your withdrawal request is denied");
		}
	}
	
	void checkBalance()
	{
		System.out.println("Balance : " + balance);
	}
}

class FixedAccount extends BankAccount
{
    int fixedPeriod = 10;
	
	public FixedAccount(int balance) 
	{
		super(balance);
	}
	
	void deposit(int amount)
	{
		System.out.println("Before deposit Balance : " + balance);
		System.out.println("Deposit amount : " + amount);
		balance += amount;
		System.out.println("After deposit Balance : " + balance);
	}
	
	void withdrawal(int period,int amount)
	{
		if(period > fixedPeriod)
		{
			System.out.println("You can withdraw " + amount);
			balance -= amount;
			System.out.println("Balance After withdrawal : " + balance);
		}
		else
		{
			System.out.println("Your withdrawal request is denied");
		}
	}
	
	void checkBalance()
	{
		System.out.println("Balance : " + balance);
	}
}

public class BankAccountProgram 
{
	public static void main(String[] args) 
	{
		SavingsAccount sa = new SavingsAccount(15000);
		sa.deposit(1000);
		sa.withdrawal(2000);
		sa.checkBalance();
		
		System.out.println("-----------------------------------------");
		
		RDAccount ra = new RDAccount(12000);
		ra.deposit(2000);
		ra.withdrawal(4,2000);
		ra.checkBalance();
		
		System.out.println("-----------------------------------------");
		
		FixedAccount fa = new FixedAccount(10000);
		fa.deposit(3000);
		fa.withdrawal(11,5000);
		fa.checkBalance();

	}
}
