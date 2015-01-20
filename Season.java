
public class Season {

	Season(){
		
	}
	
	//Simulates season
	public static void seasonSim(Team a, Team b, Team c, Team d){
		System.out.println("Week One: ");
		System.out.println("\n");
		Season.simWeekDisplay(a, b, c, d);
		System.out.println("\n" + "Week Two: ");
		System.out.println("\n");
		Season.simWeekDisplay(a, b, d, c);
		System.out.println("\n" + "Week Three: ");
		Season.simWeekDisplay(a, c, d, b);
		System.out.println("Week Four: ");
		System.out.println("\n");
		Season.simWeekDisplay(a, b, c, d);
		System.out.println("\n" + "Week Five: ");
		System.out.println("\n");
		Season.simWeekDisplay(a, b, d, c);
		System.out.println("\n" + "Week Six: ");
		System.out.println("\n");
		Season.simWeekDisplay(a, c, d, b);
	}
	
	public static void simWeek(Team a, Team b, Team c, Team d){
		
		Game.nonUserKeepScore(a,d);
		Game.getWinner(a, d);
		Game.setRecord(a, d);
		Game.gamePlayedCredit(a);
		Game.gamePlayedCredit(d);
		Game.nonUserKeepScore(b,c);
		Game.getWinner(b,c);
		Game.setRecord(b,c);
		Game.gamePlayedCredit(b);
		Game.gamePlayedCredit(c);
		Season.printStandings(a, b, c, d);
		a.resetPoints();
		b.resetPoints();
		c.resetPoints();
		d.resetPoints();
		a.resetRosterPoints();
		b.resetRosterPoints();
		c.resetRosterPoints();
		d.resetRosterPoints();
	}
	
	public static void simWeekDisplay(Team a, Team b, Team c, Team d){
		Season.simWeek(a, b, c, d);
		Season.printPPGSeason(a);
		System.out.println("\n");
		Season.printPPGSeason(b);
		System.out.println("\n");
		Season.printPPGSeason(c);
		System.out.println("\n");
		Season.printPPGSeason(d);
		System.out.println("\n");
	}
	
	public static void printStandings(Team a, Team b, Team c, Team d){
		System.out.println("Team\t  \t Wins\t  \tLosses\t  \tTies");
		System.out.println(a.getLocation()+"\t\t" + a.getWins()+ "\t\t"+a.getLosses()+"\t\t"+a.getTies());
		System.out.println(b.getLocation()+"\t\t" + b.getWins()+ "\t\t"+b.getLosses()+"\t\t"+b.getTies());
		System.out.println(c.getLocation()+"\t\t" + c.getWins()+ "\t\t"+c.getLosses()+"\t\t"+c.getTies());
		System.out.println(d.getLocation()+"\t\t" + d.getWins()+ "\t\t"+d.getLosses()+"\t\t"+d.getTies());
	}
	
	public static void printPPGSeason(Team a){
		double p1 = a.getRoster()[0].pointsPerGame();
		double p2 = a.getRoster()[1].pointsPerGame();
		double p3 = a.getRoster()[2].pointsPerGame();
		double p4 = a.getRoster()[3].pointsPerGame();
		double p5 = a.getRoster()[4].pointsPerGame();
		System.out.println("\n");
		System.out.println(a.getLocation() + " "+ a.getNickname());
		System.out.println(a.getRoster()[0].getLastName() + "\t\t"+p1);
		System.out.println(a.getRoster()[1].getLastName() + "\t\t"+p2);
		System.out.println(a.getRoster()[2].getLastName() + "\t\t"+p3);
		System.out.println(a.getRoster()[3].getLastName() + "\t\t"+p4);
		System.out.println(a.getRoster()[4].getLastName() + "\t\t"+p5);
		
	}
}
