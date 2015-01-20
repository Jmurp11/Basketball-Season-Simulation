import java.util.Random;

public class Player {
	String first_name = "";
	String last_name = "";
	int points = 0;
	int total_points = 0;
	int total_games = 0;
	double points_per_game = 0.0f;
	String [] firstArr = {"John", "Jim","Matt", "Brendan", "Robert", "Keegan", "Patrick", "Michael", "Kobe","Don", "Cam", "Mitchell", "Luke", "Jamaal", "Dez", "Jordy", "Joseph", "Desean", "Albert", "Ron", "Tom", "David", "Louis", "Spencer", "Jonathan", "Darrell", "Ty", "Tyler", "Taylor", "Latrell","Bill", "Doug", "Russell"};
	String [] lastArr = {"Bronzo", "James", "Bryant", "Talty", "Moriarty", "Werner","Gormally", "Genovese", "Mashburn", "Howard", "Webber", "Carroll", "Bowles", "Richardson", "Cromartie", "Murray", "Romo", "Kim", "Shields", "Bosworth", "Moss", "Tynes", "Alfonso", "Soriano", "Sanchez", "Powers", "Spreewell", "Boykin", "Jarrett", "Jones", "Chu", "Wilson","Wu", "Suh", "Amukamura", "McGeough", "McGuire", "Sosa", "Cauley-Stein", "Ventura", "Cauthon", "Stark","al'Thor", "ay'Barra", "al'Vere", "Baratheon", "Clegane"};
	String [] commentaryTwo = {" knocks down a two.", " is smooth tonight. He knocks down a two.", " had a great week of practice and now its paying off thats two for him!", " hits a long two."};
	String [] commentaryThree = {" knocks down a three ball!", " hits another trey!", " is hot from deep tonight. He hits a three!"};
	
	Player(){
		setFirstName();
		setLastName();
		this.first_name = getFirstName();
		this.last_name = getLastName();
		this.points = 0;
	}
	
	/*Sets First Name.  Uses generates random number to be randomly select an index from the 
	 * first name array.  First name is then = to the name at this index*/
	public void setFirstName(){
		Random rand = new Random();
		int a = rand.nextInt(firstArr.length-1);
		String first_name = firstArr[a];
		this.first_name = first_name;
	}
	
	//Returns first name
	public String getFirstName(){
		return first_name;
	}
	
	/*Sets Last Name.  Uses generates random number to be randomly select an index from the 
	 * last name array.  Last name is then = to the name at this index*/
	public void setLastName(){
		Random rand = new Random();
		int a = rand.nextInt(lastArr.length-1);
		String last_name = lastArr[a];
		this.last_name = last_name;
	}
	
	//Returns last name
	public String getLastName(){
		return last_name;
	}
	
	//Sets players points
	public void setPoints(int points){
		this.points = points;
	}

	//Returns points
	public int getPoints(){
		return points;
	}
	
	//Sets total points. used for calculating ppg.
	public void setTotalPoints(int total_points){
		this.total_points = total_points;
	}
	
	//Returns total points
	public int getTotalPoints(){
		return total_points;
	}
	
	//Sets total games played
	public void addGamePlayed(){
		this.total_games = this.total_games + 1;
	}
	
	//Return total games played
	public int getGamesPlayed(){
		return total_games;
	}
	
	//Returns Points per game average
	public double pointsPerGame(){
		points_per_game =  total_points/total_games;
		return points_per_game;
	}
	//Adds two to a players point total
	public int addTwo(){
		this.points  = this.points + 2;
		this.total_points = this.total_points + 2;
		return points;
	}
	
	//Adds 3 to a players point total
		public int addThree(){
			this.points  = this.points + 3;
			this.total_points = this.total_points + 3;
			return points;
		}
		
	//Print player
	public void printPlayer(){
		System.out.println(first_name + " " + last_name);
	}
	public void playerScoresComment2(){
		Random rand = new Random();
		int a = rand.nextInt(commentaryTwo.length-1);
		String b = commentaryTwo[a];
		
		System.out.println(last_name + b);
	}
	public void playerScoresComment3(){
		Random rand = new Random();
		int a = rand.nextInt(commentaryThree.length-1);
		String b = commentaryThree[a];
		
		System.out.println(last_name + b);
		
	}
	
	//Generates random number between 1-3
	public static int generateRandom3(){
		int a = (int) (Math.random()*3+1);
		return a;
		}
	
	//Determines if a player scores 2, 3, or commits a turnover.  Prints appropriate commentary.
	public int playerScores(){
		int rand = generateRandom3();
			if(rand == 1){
				addTwo();
				playerScoresComment2();
			}
			if(rand == 2){
				addThree();
				playerScoresComment3();
				}
			if(rand == 3){
				System.out.println(getFirstName()+ " "+ getLastName()+ " has turned the ball over!");
			}
			return rand;
		}
	
	//Determines if a player scores 2, 3, or commits a turnover. Does not print any commentary
	public int nonUserPlayerScores(){
			int rand = generateRandom3();
				if(rand == 1){
					addTwo();
				}
				if(rand == 2){
					addThree();
					}
				if(rand == 3){
				}
				return rand;
			}
	}
	

