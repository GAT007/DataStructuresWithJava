package chapter2.OODesign;

public class GeometricProgression extends Progression {
	
	protected double increment;
	
	public GeometricProgression()
	{
		this(2.0,1.0);
	}
	
	public GeometricProgression(double stepSize)
	{
		this(stepSize, 1.0);
	}
	
	public GeometricProgression(double stepSize, double start)
	{
		super(start);
		increment = stepSize;
	}

	protected void advance()
	{
		current *= increment;
	}
}
