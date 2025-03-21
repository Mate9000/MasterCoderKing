//Section 7, Lesson 3 Starter for Exercise 1 - Slide 6
package prison;

import ovOpdracht.Kaart;

public class PrisonTest {

	public static void main(String[] args) {

		Prisoner p01 = new Prisoner("Jonkler", 2.08, 2147483647);
		Prisoner p02 = new Prisoner("Bob", 1.50, 2);
		p01.print();
		p01.think();
		p02.print();



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

	    public String toString() {
	        return "Kaart{" +
	                "checking=" + checking +
	                ", saldo=" + saldo +
	                '}';
	    }
	}
	\\\
    if (userInput.equalsIgnoreCase("ja")) {
        saldoCheck(p01);
        checkingIn = true; 
    } else if (userInput.equalsIgnoreCase("nee")) {
        System.out.println("You chose not to check in. Please decide again.");
    } else {
        System.out.println("Invalid input. Please enter 'ja' or 'nee'.");
    }
}

scanner.close();
}

public static void saldoCheck(Kaart kaart) {

if (kaart.getSaldo() == 5.0 && !kaart.isChecking()) {
    System.out.println("je bent erin gecheckt.");
} else {
    System.out.println("je mist wat geld");
}
}
}
\\\\
	}
}
