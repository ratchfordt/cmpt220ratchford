package cmpt;
import java.util.Date;
import java.util.Objects;

public class SoccerMatch 
{
	private static Date startTime;
	private static Date endTime;
	private static String location;
	private static String home;
	private static String visitor;
	private static Player[] homePlayers = new Player[11];
	private static Player[] visitorPlayers = new Player[11];
	private static Goal[] homeGoals = new Goal[10];
	private static Goal[] visitorGoals = new Goal[10];
	
	public SoccerMatch()
	{
		startTime = new Date();
		location = "Marist College";
		home = "Marist";
		visitor = "Visitors";
	}
	
	public SoccerMatch(Date st, Date et, String l, String h, String v, Player[] hp, Player[] vp)
	{
		startTime = st;
		endTime = et;
		location = l;
		home = h;
		visitor = v;
		homePlayers = hp;
		visitorPlayers = vp;
	}
	
	public void addHomePlayer(Player p)
	{
		for(int i=0; i<homePlayers.length; i++)
			if(Objects.equals(homePlayers[i], null))
			{
				homePlayers[i] = p;
				return;
			}
	}
	
	public void addVisitorPlayer(Player p)
	{
		for(int i=0; i<visitorPlayers.length; i++)
			if(Objects.equals(visitorPlayers[i], null))
			{
				visitorPlayers[i] = p;
				return;
			}
	}
	
	public String getWinner()
	{
		int hgoals = 0;
		int vgoals = 0;
		
		for(; hgoals<homeGoals.length; hgoals++)
			if(Objects.equals(homeGoals[hgoals], null))
				break;
		
		for(; vgoals<visitorGoals.length; vgoals++)
			if(Objects.equals(visitorGoals[vgoals], null))
				break;
		
		if(vgoals>hgoals)
			return visitor;
		else if(vgoals<hgoals)
			return home;
		else
			return "Tie";
	}
	
	public void addHomeGoal(Goal g)
	{
		for(int i=0; i<homeGoals.length; i++)
			if(Objects.equals(homeGoals[i], null))
			{
				homeGoals[i] = g;
				return;
			}
	}
	
	public void addVisitorGoal(Goal g)
	{
		for(int i=0; i<visitorGoals.length; i++)
			if(Objects.equals(visitorGoals, null))
			{
				visitorGoals[i] = g;
				return;
			}
	}
	
	public Goal[] getHomeGoals()
	{
		return homeGoals;
	}
	
	public Goal[] getVisitorGoals()
	{
		return visitorGoals;
	}
	
	public static void main(String[] args) 
	{	
		Player player1 = new Player("John", "Vassar", 0);
		Player player2 = new Player("John", "Vassar", 0);
		Player player3 = new Player("John", "Vassar", 0);
		Player player4 = new Player("John", "Vassar", 0);
		Player player5 = new Player("John", "Vassar", 0);
		
		Player player6 = new Player("John", "Marist", 0);
		Player player7 = new Player("John", "Marist", 0);
		Player player8 = new Player("John", "Marist", 0);
		Player player9 = new Player("John", "Marist", 0);
		Player player10 = new Player("John", "Marist", 0);
		
		Player[] homeTeam = {player1, player2, player3, player4, player5};
		Player[] visitorTeam = {player6, player7, player8, player9, player10};
		
		Date d = new Date();
		
		SoccerMatch match = new SoccerMatch(d, d, "Vassar College", "Vassar", "Marist", homeTeam, visitorTeam);
		Goal g = new Goal(30, player3);
		match.addHomeGoal(g);
		System.out.print(match.getWinner());
		
	}
	
}
