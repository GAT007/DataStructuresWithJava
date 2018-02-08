package chapter2.OODesign;

public class BoxedItem implements Sellable, Transportable{

	private String descript;		//description of this item
	private int price;			//list price in cents
	private int weight; 		//weight in grams
	private boolean haz;		//true if object is hazardous
	private int height = 0;		//box height in cm
	private int depth = 0;		//box depth in cm
	private int width = 0;		//box width in cm

	//Constructor
	public BoxedItem(String desc, int p, int w, boolean h)
	{
		descript = desc;
		price = p;
		weight = w;
		haz = h;
	}
	
	public String description() {
		return descript;
	}
	
	public int listPrice()
	{
		return price;
	}
	
	public int lowestPrice()
	{
		return price/2;
	}
	
	public int weight()
	{
		return weight;
	}
	
	public boolean isHazardous()
	{
		return haz;
	}
	
	public int insuredValue()
	{
		return price*2;
	}
	
	public void setBox(int h, int w, int d)
	{
		height = h;
		width = w;
		depth = d;
	}
}
