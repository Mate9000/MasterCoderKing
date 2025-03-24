package ovOpdracht;

public class Kaart extends KaartPort {

	private boolean checking;
	private double saldo;

	// the amount of money i get i will be able to put it in kaartport in kaart p01 on how much i have 
	public Kaart(double saldo) {
		this.saldo = saldo;
	}

	// this picks up the card balance to later on check it in kaartport
	public double getSaldo() {
		return saldo;
	}

	//
	public boolean isChecking() {
		return checking;
	}

	public void setChecking(boolean checking) {
		this.checking = checking;
	}

	public void displayInfo() {
		System.out.println("Card Balance: " + saldo);
		System.out.println("Is Checking Card checked in?: " + checking);
	}

}
