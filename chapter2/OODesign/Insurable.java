package chapter2.OODesign;

public interface Insurable extends Sellable, Transportable {
	
	//Returns an insured value in cents
	public int insuredValue();
	

}
