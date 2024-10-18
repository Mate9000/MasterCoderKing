package input;

import java.util.Random;
import java.util.Scanner;

public class MateCodeBreakerReal {
    public static void main(String[] args) {
        //deze string is gemaakt dat de speller well iets in kan typen later op
    	String userInput;
        //aangeven dat de max attempts 10 is
        int maxAttempts = 10;
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // deze 4 generates een random digit code tussen de 0 en de 5 en ik moeste dit 4 keer doen anders krijg ik gen 4 digit code maar 1 digit code
        int x = random.nextInt(6); 
        int y = random.nextInt(6);
        int z = random.nextInt(6);
        int w = random.nextInt(6);
        //hier onder zet ik de 4 aparte digits in een 4 digit rij zodat ze een 4 digit code kunnen worden en ik print de secret code uit om te zien of het werkt of niet
        String secretCode = "" + x + y + z + w;
        System.out.println("Secret Code: " + secretCode); 
        System.out.println("only 4 digit code allowed otherwise game crashes"); 
        //dit is de attempt counter en het voegt 1 erbij bij elke gok
        for (int i = 1; i <= maxAttempts; i++) {
            System.out.println("Attempt " + i + ": Enter your 4-digit guess from 0 to 5:");
            userInput = sc.nextLine(); 
            //als je de 4 digit code goed hebt geraden dan krijg je deze tekst hier onder en het breakt zodat de code zou stoppen als de code goed is
            if (userInput.equals(secretCode)) {
                System.out.println("Yippieeeee! You win!");
                break; 
            } else {
                //hier onder zet ik met deze lijn code de aparte digits in een character zodat ik later op in de coe na kan kijken
                int a = Character.getNumericValue(userInput.charAt(0));
                int b = Character.getNumericValue(userInput.charAt(1));
                int c = Character.getNumericValue(userInput.charAt(2));
                int d = Character.getNumericValue(userInput.charAt(3));

                //checks de eerste digit als het goed niet goed of een dichtbi is of het helemaal fout is
                if (a == x) {
                    System.out.print("G");
                } else if (a == y || a == z || a == w) {
                    System.out.print("N");
                } else {
                    System.out.print("-");
                }
                //checks de tweede digit als het goed niet goed of een dichtbi is of het helemaal fout is
                if (b == y) {
                    System.out.print("G");
                } else if (b == x || b == z || b == w) {
                    System.out.print("N");
                } else {
                    System.out.print("-");
                }
                //checks de derde digit als het goed niet goed of een dichtbi is of het helemaal fout is
                if (c == z) {
                    System.out.print("G");
                } else if (c == x || c == y || c == w) {
                    System.out.print("N");
                } else {
                    System.out.print("-");
                }
                //checks de vierde digit als het goed niet goed of een dichtbi is of het helemaal fout is
                if (d == w) {
                    System.out.print("G");
                } else if (d == x || d == y || d == z) {
                    System.out.print("N");
                } else {
                    System.out.print("-");
                }   
                
                
                System.out.println(); // did maakt zeker dat de nakijk ding niet samen zit met de attempt counter
            }

            if (i == maxAttempts) {
                System.out.println("Womp, Womp! You've used all attempts."); //als je max attempts op is dus max attempt 10 gebruit dan stopt alles en je krijgt womp womp 
            }
        }

        sc.close(); //scanner is door dit gesloten
    }
}