package mastermind;

import java.util.Scanner;
import java.util.Random;

public class CodebreakerGame {
    public static void main(String[] args) {
        // Game setup
        final int CODE_LENGTH = 4;   // Length of the secret code
        final int MAX_ATTEMPTS = 10; // Maximum number of guesses
        int[] secretCode = generateCode(CODE_LENGTH); // Generate random secret code
        int attempts = 0; 
        boolean gameWon = false;

        // Welcome message
        System.out.println("Welcome to Codebreaker!");
        System.out.println("Try to guess the secret " + CODE_LENGTH + "-digit code.");
        System.out.println("You have " + MAX_ATTEMPTS + " attempts to guess the code.");
        
        Scanner scanner = new Scanner(System.in);
        
        // Main game loop
        while (attempts < MAX_ATTEMPTS && !gameWon) {
            System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");
            String guess = scanner.nextLine();
            
            // Check if the guess is valid
            if (guess.length() != CODE_LENGTH || !isNumeric(guess)) {
                System.out.println("Invalid guess. Please enter a " + CODE_LENGTH + "-digit number.");
                continue;
            }

            // Convert guess to an array of integers
            int[] guessArray = new int[CODE_LENGTH];
            for (int i = 0; i < CODE_LENGTH; i++) {
                guessArray[i] = Character.getNumericValue(guess.charAt(i));
            }

            // Provide feedback on the guess
            int correctPosition = countCorrectPositions(secretCode, guessArray);
            int correctNumbers = countCorrectNumbers(secretCode, guessArray) - correctPosition;

            // Display feedback
            System.out.println("Correct digits in the correct position: " + correctPosition);
            System.out.println("Correct digits but in the wrong position: " + correctNumbers);
            System.out.println(correctPosition);

            // Check if the game is won
            if (correctPosition == CODE_LENGTH) {
                gameWon = true;
                System.out.println("Congratulations! You've guessed the secret code.");
            }

            attempts++;
        }

        if (!gameWon) {
            System.out.println("You've run out of attempts. The secret code was: " + codeToString(secretCode));
        }

        scanner.close();
    }

    // Generates a random secret code of a given length
    public static int[] generateCode(int length) {
        Random random = new Random();
        int[] code = new int[length];
        for (int i = 0; i < length; i++) {
            code[i] = random.nextInt(10); // Random digit between 0 and 9
        }
        return code;
    }

    // Checks if the given string contains only digits
    public static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    // Counts the number of digits in the correct position
    public static int countCorrectPositions(int[] secretCode, int[] guess) {
        int count = 0;
        for (int i = 0; i < secretCode.length; i++) {
            if (secretCode[i] == guess[i]) {
                count++;
            }
        }
        return count;
    }

    // Counts the number of correct digits, regardless of position
    public static int countCorrectNumbers(int[] secretCode, int[] guess) {
        int[] codeFrequency = new int[10]; // Frequencies of digits in secret code
        int[] guessFrequency = new int[10]; // Frequencies of digits in guess

        // Count the frequency of each digit in both secret code and guess
        for (int i = 0; i < secretCode.length; i++) {
            codeFrequency[secretCode[i]]++;
            guessFrequency[guess[i]]++;
        }

        // Calculate the number of correct digits
        int correctNumbers = 0;
        for (int i = 0; i < 10; i++) {
            correctNumbers += Math.min(codeFrequency[i], guessFrequency[i]);
        }

        return correctNumbers;
    }

    // Converts the secret code to a string for display
    public static String codeToString(int[] code) {
        StringBuilder sb = new StringBuilder();
        for (int digit : code) {
            sb.append(digit);
        }
        return sb.toString();
    }
}
