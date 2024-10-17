package input;

import java.util.Random;
import java.util.Scanner;

public class Debughelper {
    public static void main(String[] args) {
        String userInput;
        int maxAttempts = 10;

        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        int x = random.nextInt(7); 
        int y = random.nextInt(7);
        int z = random.nextInt(7);
        int w = random.nextInt(7);
        
        String secretCode = "" + x + y + z + w;
        System.out.println("Secret Code: " + secretCode); 

        for (int i = 1; i <= maxAttempts; i++) {
            System.out.println("Attempt " + i + ": Enter your 4-digit guess:");
            userInput = sc.nextLine(); 
            
            if (userInput.equals(secretCode)) {
                System.out.println("Yippieeeee! You win!");
                break; 
            } else {
                
                int a = Character.getNumericValue(userInput.charAt(0));
                int b = Character.getNumericValue(userInput.charAt(1));
                int c = Character.getNumericValue(userInput.charAt(2));
                int d = Character.getNumericValue(userInput.charAt(3));


                if (a == x) {
                    System.out.print("G");
                } else if (a == y || a == z || a == w) {
                    System.out.print("N");
                } else {
                    System.out.print("-");
                }

                if (b == y) {
                    System.out.print("G");
                } else if (b == x || b == z || b == w) {
                    System.out.print("N");
                } else {
                    System.out.print("-");
                }

                if (c == z) {
                    System.out.print("G");
                } else if (c == x || c == y || c == w) {
                    System.out.print("N");
                } else {
                    System.out.print("-");
                }

                if (d == w) {
                    System.out.print("G");
                } else if (d == x || d == y || d == z) {
                    System.out.print("N");
                } else {
                    System.out.print("-");
                }
                if
                System.out.println(); // New line after feedback
            }

            if (i == maxAttempts) {
                System.out.println("Womp, Womp! You've used all attempts.");
            }
        }

        sc.close(); // Close the scanner
    }
}