package chapter1.JavaPrimer;

public class CreditCard {
	
	private String customer; // name of the customer
	private String bank; // name of the bank
	private String account;
	private int limit;
	protected double balance;
	
	//Constructors
	public CreditCard(String cust, String bk, String acnt, int lim, double initialBal)
	{
		customer = cust;
		bank = bk;
		account = acnt;
		limit = lim;
		balance = initialBal;
	}
	
	public CreditCard(String cust, String bk, String acnt, int lim)
	{
		this(cust,bk,acnt,lim,0.0);
	}
	
	//Accessor Methods
	public String getCustomer() {return customer;}
	public String getBank() {return bank;}
	public String getAccount() {return account;}
	public int getLimit() {return limit;}
	public double getBalance() {return balance;}
	
	//Update Methods 
	public boolean charge(double price) // submit a charge to check whether it is under the limit or not
	{									
		if(price + balance > limit)	//if charge surpasses the limit
			return false;			//refuse the charge
		//at this point charge is successful
		balance+=price;		//update the balance;
		return true;		//announce the good news
	}
	
	// This method makes a payment back to the bank
	public void makePayment(double amount)
	{
		balance -= amount;
	}
	
	public static void printSummary(CreditCard card)
	{
		System.out.println("Customer = : " + card.customer);
		System.out.println("Bank = : " + card.bank);
		System.out.println("Account = " + card.account);
		System.out.println("Balance = " + card.balance);
		System.out.println("Limit = "+card.limit);
	}
	
	public static void main(String [] args)
	{
		CreditCard[] wallet = new CreditCard[3];
		wallet[0] = new CreditCard("John Bowman", "California Savings", "5391 0375 9387 5309", 5000);
		wallet[1] = new CreditCard("Shibani Naik", "Bank of Amith", "0000 0000 0000 0001", 1000000);
		wallet[2] = new CreditCard("Someone just like this", "One two ka four", "0000 0000 0000 0002",10000);
		
		for(int val = 1; val<=16;val++)
		{
			wallet[0].charge(3*val);
			wallet[1].charge(2*val);
			wallet[2].charge(val);
		}
		
		for(CreditCard card : wallet)
		{
			CreditCard.printSummary(card);
			while(card.getBalance() > 200.0)
			{
				card.makePayment(200);
				System.out.println("New Balance = " + card.getBalance());
			}
		}
	}

}
