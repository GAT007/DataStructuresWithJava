package chapter3.FundamentalDataStructures;

public class GameEntry {

	private String name; //name of the person earning this score
	private int score;		//the score value
	
	/*
	 * Consturcts a game entry with the given parameters
	 */
	
	public GameEntry(String n, int s)
	{
		name = n;
		score = s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String toString() 
	{
		return "(" + name + "," + score + ")";
	}
	
}
