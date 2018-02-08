package chapter1.JavaPrimer;

public class PredatoryCreditCard extends CreditCard {

	// Instance variable that calculates annual percentage rate
	private double apr;

	// Constructor for this class
	public PredatoryCreditCard(String cust, String bank, String acnt, int lim, double initialBal, double rate) {
		super(cust, bank, acnt, lim, initialBal);
		apr = rate;
	}

	// New method to assess monthly charges
	public void processMonth() {
		if (balance > 0) {
			double monthlyFactor = Math.pow(1 + apr, 1.0 / 12);
			balance *= monthlyFactor;
		}
	}

	// Overriding the charge method defined in the superclass
	public boolean Charge(double charge) {
		boolean isSuccess = super.charge(charge); // Call the method of the super class
		if (!isSuccess) {
			balance += 5;
		}
		return isSuccess; // Announce the good news;
	}

}
