package chapter2.OODesign;

public class ExceptionExample {
	
	static int DEFAULT = 10;
	public static void main (String [] args)
	{
		int n = DEFAULT;
		try
		{
			n = Integer.parseInt(args[0]);
			if(n<=0)
			{
				System.out.println("n must be positive. Using Default");
				n= DEFAULT;
			}
			
		}
		catch(ArrayIndexOutOfBoundsException | NumberFormatException e)
		{
			System.out.println("Looks like an exception ");
		}
	}

}
