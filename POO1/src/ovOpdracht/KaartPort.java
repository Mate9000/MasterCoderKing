package ovOpdracht;

import java.util.Scanner;

public class KaartPort {

    public static void main(String[] args) {

        Kaart p01 = new Kaart(5.1);


        Scanner scanner = new Scanner(System.in);


        boolean checkingIn = true;


        while (checkingIn) {

            System.out.println("Do you want to check in? (ja/nee)");
            String userInput = scanner.nextLine();


        if (userInput.equals("ja")) {
            saldoCheck(p01);
            checkingIn = false; 
        } else if (userInput.equals("nee")) {
            System.out.println("You chose not to check in. Please decide again.");
        } else {
            System.out.println("Invalid input. Please enter 'ja' or 'nee'.");
        }
    }

    scanner.close();
    }

    public static void saldoCheck(Kaart kaart) {

    if (kaart.getSaldo() >= 5.0 && !kaart.isChecking()) {
        System.out.println("je bent erin gecheckt.");
    } else {
        System.out.println("je mist wat geld");
    }
    
    }
    }