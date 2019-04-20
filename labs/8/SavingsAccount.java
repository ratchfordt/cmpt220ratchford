package cmpt;

public class SavingsAccount extends Account 
{
	public SavingsAccount(int an, double b, double i, String d)
	{
		super(an, b, i, d);
	}
	
	public boolean withdraw(double x)
	{
		if(super.balance-x <0)
			return false;
		
		super.withdraw(x);
		return true;
	}
	
	public String toString()
	{
		return "Account number: " + super.accountNumber + 
				"\nBalance: " + super.balance + 
				"\nInterest rate: " + super.interest + 
				"\nDate created: " + super.date +
				"\nAccount type: Savings";
	}
}
