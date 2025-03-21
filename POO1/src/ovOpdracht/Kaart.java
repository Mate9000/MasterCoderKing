package ovOpdracht;

public class Kaart extends KaartPort {

    private boolean checking;
    private double saldo;

    
    public Kaart(double saldo) {
        this.saldo = saldo;
    }


	public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



    public boolean isChecking() {
        return checking;
    }


    public void setChecking(boolean checking) {
        this.checking = checking;
    }


    public void displayInfo() {
        System.out.println("Card Balance: " + saldo);
        System.out.println("Is Checking Card: " + checking);
    }

    }



