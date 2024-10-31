package javaExerciseSpecial;
import java.util.Scanner;
public class Opdracht38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("The string is: ");
        String input = scanner.nextLine(); // Read the input string

        // Initialize counters
        int letterCount = 0;
        int spaceCount = 0;
        int numberCount = 0;
        int otherCount = 0;

        // Iterate through each character in the string
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                letterCount++; // Count letters
            } else if (Character.isWhitespace(ch)) {
                spaceCount++; // Count spaces
            } else if (Character.isDigit(ch)) {
                numberCount++; // Count numbers
            } else {
                otherCount++; // Count other characters
            }
        }

        // Output the results
        System.out.println("letter: " + letterCount);
        System.out.println("space: " + spaceCount);
        System.out.println("number: " + numberCount);
        System.out.println("other: " + otherCount);

        // Close the scanner
        scanner.close();
	}

}
