package chapter2.OODesign;

public class ArithmeticProgression extends Progression {

	
	protected double increment;
	
	//Constructs progression 0,1,2
	public ArithmeticProgression()
	{
		this(1.0,0.0);
	}
	
	public ArithmeticProgression(double stepsize)
	{
		this(stepsize,0);
	}
	
	public ArithmeticProgression(double stepsize, double start)
	{
		super(start);
		increment = stepsize;
	}
	
	protected void advance()
	{
		current += increment;
	}
}
