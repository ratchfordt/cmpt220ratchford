package cmpt;

public class CheckingAccount extends Account
{
	private double overdraft;
	public CheckingAccount(int an, double b, double i, String d, double o)
	{
		super(an, b, i, d);
		overdraft = o;
	}
	
	public boolean withdraw(double x)
	{
		if(super.balance-x<overdraft)
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
				"\nAccount type: Checking";
	}
}
