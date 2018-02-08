package chapter2.OODesign;

public class FibonacciProgression extends Progression {
	
	protected double prev;
	public double current;
	
	public FibonacciProgression()
	{
		this(0.0,1.0);
	}
	
	public FibonacciProgression(double first, double second)
	{
		super(first);
		prev = second - first;
	}
	
	protected void advance()
	{
		double temp = prev;
		prev = current;
		current += temp;
	}
	
	

}
