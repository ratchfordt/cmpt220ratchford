package cmpt;

public class Staff extends Person
{
	private Key masterKey;
	private String job;

	public Staff(Key pk, Key mk, String n, String j)
	{
		super(pk, n);
	}
	
	public Key getMaster()
	{
		return masterKey;
	}
	
	public String getJob()
	{
		return job;
	}
	
	public String toString()
	{
		return "job: " + job + "\nname: " + super.getName() + "\n";
	}
}
