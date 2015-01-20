import java.lang.Math;

public class Game {

Game(){
	
}

//Generates random number 1-3 for the three options: Score 2, Score 3 or turnover.
public static int generateRandom3(){
int a = (int) (Math.random()*3+1);
return a;
}

//Generates random number 1-5 to determine which player will have possession
public static int generateRandom5(){
int a = (int) (Math.random()*5+1);
return a;
}

//Keep score in user games.  i.e. prints game action.
public static void userKeepeepScore(Team a, Team b){
	boolean one_has = false;
	for(int i = 0; i < 40; i++){
		while(one_has == true){
			a.keepTeamScore();
			one_has = false;
		}
		System.out.println("The score is now " +a.getLocation()+ " "+ a.getNickname() + " "+ a.getPoints()+ " - " + b.getLocation()+ " "+ b.getNickname() + " "+ b.getPoints());
		while(one_has == false){
			b.keepTeamScore();
			one_has = true;
		}
	}
}
//keeps score, does not print action.  Used to simulate season.
public static void nonUserKeepScore(Team a, Team b){
	boolean one_has = false;
	for(int i = 0; i < 40; i++){
		while(one_has == true){
			a.nonUserKeepScore();
			one_has = false;
		}
		while(one_has == false){
			b.nonUserKeepScore();
			one_has = true;
		}
	}
}
//Get winner
public static void getWinner(Team a, Team b){
	if(a.getPoints()>b.getPoints()){
		System.out.println(a.getLocation()+ " "+ a.getNickname() + " "+ a.getPoints()+ " - " + b.getLocation()+ " "+ b.getNickname() + " "+ b.getPoints());
		System.out.println(a.getNickname() + " win the game.");
		System.out.println("\n");
	}
	else if(a.getPoints()<b.getPoints()){
		System.out.println(a.getLocation()+ " "+ a.getNickname() + " "+ a.getPoints()+ " - " + b.getLocation()+ " "+ b.getNickname() + " "+ b.getPoints());
		System.out.println(b.getNickname() + " win the game.");
		System.out.println("\n");
	}
}
//Prints Roster With points 
public static void printLeadingScorers(Team a){
	Player p1 = a.getRoster()[0];
	Player p2 = a.getRoster()[1];
	Player p3 = a.getRoster()[2];
	Player p4 = a.getRoster()[3];
	Player p5 = a.getRoster()[4];
	
	System.out.println("Here are tonight's leading scorers: "+ "\n");
	System.out.println(p1.getFirstName()+ " "+ p1.getLastName() + " scored " + p1.getPoints()+ " points");
	System.out.println(p2.getFirstName()+ " "+ p2.getLastName() + " scored " + p2.getPoints()+ " points");
	System.out.println(p3.getFirstName()+ " "+ p3.getLastName() + " scored " + p3.getPoints()+ " points");
	System.out.println(p4.getFirstName()+ " "+ p4.getLastName() + " scored " + p4.getPoints()+ " points");
	System.out.println(p5.getFirstName()+ " "+ p5.getLastName() + " scored " + p5.getPoints()+ " points");
}

//Credits each player with a game played
public static void gamePlayedCredit(Team a){
	Player p1 = a.getRoster()[0];
	Player p2 = a.getRoster()[1];
	Player p3 = a.getRoster()[2];
	Player p4 = a.getRoster()[3];
	Player p5 = a.getRoster()[4];
	
	p1.addGamePlayed();
	p2.addGamePlayed();
	p3.addGamePlayed();
	p4.addGamePlayed();
	p5.addGamePlayed();
	
}

//Credits team for wins/losses/ties
public static void setRecord(Team a, Team b){
	if(a.getPoints() > b.getPoints()){
		a.setWins();
		b.setLosses();
	}
	else if(a.getPoints() < b.getPoints()){
		b.setWins();
		a.setLosses();
	}
	else if(a.getPoints() == b.getPoints()){
		a.setTies();
		b.setTies();
	}
}
}

	
