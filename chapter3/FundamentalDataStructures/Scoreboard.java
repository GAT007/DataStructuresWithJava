package chapter3.FundamentalDataStructures;

public class Scoreboard {
	
	private int numEntries = 0;  //number of actual entries
	private GameEntry[] board; //array of game entries
	public Scoreboard(int capacity)
	{
		board = new GameEntry[capacity];
	}
	
	public void add(GameEntry e)
	{
		int newScore = e.getScore();
		// now to check whether the new entry is really a high score?
		if(numEntries < board.length || newScore > board[numEntries-1].getScore())
		{
			if(numEntries < board.length)
				numEntries++;
		}
		int j = numEntries - 1;
		while(j > 0 && board[j-1].getScore() < newScore)
		{
			board[j] = board[j-1];
			j--;
		}
		board[j] = e;
	}
	
	public GameEntry remove(int i)
	{
		if(i<0 || i> board.length)
		{
			throw new IndexOutOfBoundsException(" Invalid index : " + i);
		}
		GameEntry temp = board[i];
		return temp;
	}

}
