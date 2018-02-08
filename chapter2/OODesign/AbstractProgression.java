package chapter2.OODesign;

public abstract class AbstractProgression {
	
	protected double current;
	
	public AbstractProgression() { this(0); }
	
	public AbstractProgression(double start) {
		current = start;
	}
	
	public Double nextValue() {
		Double answer = current;
		advance();
		return answer;
	}
	
	public void printProgression(int n)
	{
		System.out.print(nextValue());
		for(int i = 1; i<n; i++)
		{
			System.out.print(" " + nextValue());
		}
		System.out.println();
	}
	
	protected abstract void advance();

}
