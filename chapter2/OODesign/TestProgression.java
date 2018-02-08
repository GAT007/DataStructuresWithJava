package chapter2.OODesign;

public class TestProgression {
	
	public static void main(String[] args)
	{
		Progression prog;
		//Testing Airthmetic Progression
		System.out.print("Arithmetic Progression with default increment : ");
		prog = new ArithmeticProgression();
		prog.printProgression(10);
		System.out.print("Arithmetic Progression with increment 5 : ");
		prog = new ArithmeticProgression(5);
		prog.printProgression(10);
		System.out.print("Arithmetic Progression with start 2 and increment 5 : ");
		prog = new ArithmeticProgression(2,5);
		prog.printProgression(10);
		
		
		//Testing Geometric Progression
		System.out.print("Geometric Progression with default base : ");
		prog = new GeometricProgression();
		prog.printProgression(10);
		System.out.print("Geometric Progression with base 3 : ");
		prog = new GeometricProgression(3);
		prog.printProgression(10);
		
		//Testing Fibonacci Progression
		System.out.print("Fibonacci Progression with default base : ");
		prog = new FibonacciProgression();
		prog.printProgression(10);
		System.out.print("Fibonacci Progression with base 4");
		prog = new FibonacciProgression();
		
	}

}
