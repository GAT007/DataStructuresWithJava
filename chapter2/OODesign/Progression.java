package chapter2.OODesign;

public class Progression {

	// instance variable
	protected double current;

	/** Constructs a progression starting at zero */
	public Progression() {
		this(0);
	}
	
	
	/**Constructs a progression with given start value*/
	public Progression(double start)
	{
		current = start;
	}
	
	//Returns the next value of the progression
	public double nextValue()
	{
		double answer=current;
		advance();
		return answer;
	}
	
	//Advances the current value to the next value of the progression 
	
	protected void advance()
	{
		current++;
	}
	
	//Prints the entire progression value
	
	public void printProgression(int n)
	{
		System.out.println(nextValue());
		for(int j =1 ;j<n;j++)
		{
			System.out.print(" " + nextValue());
		}
		System.out.println();
	}

}
