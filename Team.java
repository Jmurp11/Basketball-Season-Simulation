import java.util.Random;
import java.util.ArrayList;
public class Team {
String location = "";
String nickname = "";
int points = 0;
int wins = 0;
int losses = 0;
int ties = 0;
Player player1 = new Player();
Player player2 = new Player();
Player player3 = new Player();
Player player4 = new Player();
Player player5 = new Player();
Player [] roster = new Player[5];
String [] locationArr = {"New York", "Boston", "Los Angeles", "Miami", "Detroit","Phoenix", "Jacksonville", "Sacremento", "Minneapolis", "Kentucky", "Raleigh", "Hartford", "Montreal", "Quebec", "Portland", "Charleston", "Toronto", "Hamilton", "St. Louis", "Kansas City", "Alabama", "Vancouver", "San Francisco", "New Jersey", "Philadelphia", "Brooklyn", "Westchester", "Buffalo", "Bridgeport", "Indianapolis", "Oakland", "Houston", "Birmingham", "Seattle", "Vancouver", "Omaha"}; //array of possible locations
String [] nicknameArr = {"Bulldogs", "Titans", "Express", "Freeze", "Blues", "Demons", "Red Storm", "Panthers", "Polar Bears", "Suns", "Blizzard", "Aces", "Outlaws", "Whalers", "Gamecocks", "Wildcats", "Wolfpack", "Gaels", "Rams", "Pirates", "Dragons", "Gulls", "Tigers", "Bears", "Sting Rays", "Warriors", "Gators", "Friars", "Crusaders", "Maroons", "Coyotes", "Kings", "Americans", "Flames", "North Stars", "Cowboys", "Colts", "Golden Seals"};//array of possible team nicknames

Team(){
	setLocation();
	this.location = getLocation();
	setNickname();
	this.nickname = getNickname();
	setRoster();
	this.roster = getRoster();
}

//Sets location to a random index of location array
public void setLocation(){
	Random rand = new Random();
	int a  = rand.nextInt(locationArr.length-1);
	String location = locationArr[a];
	this.location = location;
}

//Returns location
public String getLocation(){
	return location;
}

//Sets Nickname to a random index of nickname array
public void setNickname(){
	Random rand = new Random();
	int a  = rand.nextInt(nicknameArr.length-1);
	String nickname = nicknameArr[a];
	this.nickname = nickname;
}

//Returns nickname
public String getNickname(){
	return nickname;
}

//Sets points
public void setPoints(int points){
	this.points = points;
}
public int getPoints(){
	return this.points;
}

//sets team wins
public void setWins(){
	this.wins = wins + 1;
}

//returns number of wins
public int getWins(){
	return wins;
}

//sets team losses
public void setLosses(){
	this.losses = this.losses + 1;
}

//Returns losses
public int getLosses(){
	return losses;
}

//sets ties
public void setTies(){
	this.ties = this.ties + 1;
}

//return ties
public int getTies(){
	return ties;
}

//Sets team roster
public void setRoster(){
	Player [] roster = {this.player1, this.player2, this.player3, this.player4, this.player5};
	this.roster = roster;
}

//Returns Roster
public Player[] getRoster(){
	return roster;
}

//Prints Lineup/Roster
public void printRoster(){
System.out.println("Team Name: "+ location + " " +nickname);
System.out.println("Player Name: ");
player1.printPlayer();
player2.printPlayer();
player3.printPlayer();
player4.printPlayer();
player5.printPlayer();
}
//Adds two to team's point total
public void addTwoPoints(){
	this.points= this.points + 2;
}

//Adds three to team's point total
public void addThreePoints(){
	this.points = this.points +3;
}

//Decides whether to add two or three to point total
public void addPoints(int a){
	if(a == 1){
	addTwoPoints();
	}
	else if(a == 2){
		addThreePoints();
	}
	else if(a == 3){
		points  = points + 0;
	}
}

//Generates random number 1-5 to determine which player will have possession
public static int generateRandom5(){
int a = (int) (Math.random()*5+1);
return a;
}
//Keeps a team score
public int keepTeamScore(){
	int rand = generateRandom5();
		if(rand == 1){
			int a = player1.playerScores();
			addPoints(a);	
		}
		if(rand == 2){
			int a = player2.playerScores();
			addPoints(a);
		}
		if(rand == 3){
			int a = player3.playerScores();
			addPoints(a);
		}
		if(rand == 2){
			int a = player4.playerScores();
			addPoints(a);
		}
		if(rand == 2){
			int a = player5.playerScores();
			addPoints(a);
		}
	return points;
}

//keeps score for non user games. used for simulation
public int nonUserKeepScore(){
	int rand = generateRandom5();
	if(rand == 1){
		int a = player1.nonUserPlayerScores();
		addPoints(a);	
	}
	if(rand == 2){
		int a = player2.nonUserPlayerScores();
		addPoints(a);
	}
	if(rand == 3){
		int a = player3.nonUserPlayerScores();
		addPoints(a);
	}
	if(rand == 2){
		int a = player4.nonUserPlayerScores();
		addPoints(a);
	}
	if(rand == 2){
		int a = player5.nonUserPlayerScores();
		addPoints(a);
	}
return points;
}

//Reset roster's individual point total to 0 after game.
public void resetRosterPoints(){
	player1.setPoints(0);
	player2.setPoints(0);
	player3.setPoints(0);
	player4.setPoints(0);
	player5.setPoints(0);
}

//prints each player on the teams total points
public void printTotalRosterPoints(){
	System.out.println(getLocation()+ " "+getNickname());
	System.out.println(player1.getFirstName() + " "+player1.getLastName() +"  \t  "+player1.getTotalPoints());
	System.out.println(player2.getFirstName() + " "+player2.getLastName() +"  \t  "+player2.getTotalPoints());
	System.out.println(player3.getFirstName() + " "+player3.getLastName() +"  \t  "+player3.getTotalPoints());
	System.out.println(player4.getFirstName() + " "+player4.getLastName() +"  \t  "+player4.getTotalPoints());
	System.out.println(player5.getFirstName() + " "+player5.getLastName() +"  \t  "+player5.getTotalPoints());
}
public void resetPoints(){
	this.points = 0;
}
}