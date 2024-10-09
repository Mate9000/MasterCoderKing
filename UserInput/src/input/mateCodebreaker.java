package input;

import java.util.Random;
import java.util.Scanner;

public class mateCodebreaker {
    public static void main(String[] args) {
        // Generate a random 4-digit code
        Random random = new Random();
        int[] code = new int[4];
        for (int i = 0; i < 4; i++) {
            code[i] = random.nextInt(6) + 1; // did maakt random generated nummer aan :)
        }

        // begin van je aantal attempts is op null
        int attempts = 0;

        // Initialize the scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcom naar mateCodebreaker!");
        System.out.println("je mag alleen 4 digit code maken tussen de nummers van 1 tot 6 en aub spties tussen de nummers net als dit -> 1 1 1 1");
        System.out.println("hier onder zet ik wat goed is goeie nummer maar verkeerd nummer en fout hier onde");
        System.out.println("* 'G' je hebt deze goed");
        System.out.println("* '*' goeie nummer maar verkeerde plek");
        System.out.println("* 'F' je hebt deze fout");
        boolean loop = true;
        while (loop) {
            // Ask the user for their guess
            System.out.print("raad hier aub: ");
            String[] guessStr = scanner.nextLine().split();
            int[] guess = new int[4];
            for (int i = 0; i < 4; i++) {
                guess[i] = Integer.parseInt(guessStr[i]);
            }

            // Check if the guess is valid
            boolean validGuess = true;
            for (int i = 0; i < 4; i++) {
                if (guess[i] < 1 || guess[i] > 6) {
                    validGuess = false;
                    break;
                }
            }
            if (!validGuess) {
                System.out.println("Invalid guess. Please enter 4 digits between 1 and 6.");
                continue;
            }

            // Give feedback on the guess
            attempts++;
            System.out.print("Attempt " + attempts + ": ");
            for (int i = 0; i < 4; i++) {
                if (guess[i] == code[i]) {
                    System.out.print("G ");
                } else if (contains(code, guess[i])) {
                    System.out.print("* ");
                } else {
                    System.out.print("F ");
                }
            }
            System.out.println();

            // Check if the user has won
            boolean won = true;
            for (int i = 0; i < 4; i++) {
                if (guess[i] != code[i]) {
                    won = false;
                    break;
                }
            }
            
            if (won) {
                System.out.println("Congratulations! You won in " + attempts + " attempts.");
               loop = false;
                
            }
        }
    }

    // Helper method to check if an array contains a certain element
    public static boolean contains(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }
}