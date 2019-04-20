package cmpt;

public class Account
{
	protected int accountNumber;
	protected double balance;
	protected double interest;
	protected String date;
	
	public Account(int an, double b, double i, String d)
	{
		accountNumber = an;
		balance = b;
		interest = i;
		date = d;
	}
	
	public void deposit(double x)
	{
		balance += x;
	}
	
	public boolean withdraw(double x)
	{
		balance -= x;
		return true;
	}
	
	public String toString()
	{
		return "Account number: " + accountNumber + 
				"\nBalance: " + balance + 
				"\nInterest rate: " + interest + 
				"\nDate created: " + date;
	}
}
