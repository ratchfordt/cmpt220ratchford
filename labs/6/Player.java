package cmpt;

public class Player
{
	private String name;
	private int goals;
	private String team;
	
	public Player()
	{
		name = "";
		goals = 0;
		team = "n/a";
	}
	
	public Player(String n, String t, int g)
	{
		name = n;
		team = t;
		goals = g;
	}
	
	public void setName(String s)
	{
		name = s;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setTeam(String s)
	{
		team = s;
	}
	
	public String getTeam()
	{
		return team;
	}
	
	public void addGoal()
	{
		goals++;
	}
	
	public int getGoals()
	{
		return goals;
	}
	
}
