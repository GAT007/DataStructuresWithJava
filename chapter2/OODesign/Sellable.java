package chapter2.OODesign;

public interface Sellable {

	//Returns a description of the object.
	public String description();
	
	//REturns the list price in cents
	public int listPrice();
	
	//Returns the lowest price in cents we will accept
	public int lowestPrice();
	
	
}
