package cmpt;

public class Guest extends Person
{
	int room;
	
	public Guest(Key k, String n, int r) 
	{
		super(k, n);
		room = r;
	}
	
	int getRoom()
	{
		return room;
	}
}
