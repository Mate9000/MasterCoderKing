package javaExerciseSpecial;
import java.util.Scanner;
public class Opdracht37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Input a string: ");
        String input = scanner.nextLine(); // Read the input string

        // Reverse the string
        String reversedString = reverse(input);

        // Output the reversed string
        System.out.println("Reverse string: " + reversedString);

        // Close the scanner
        scanner.close();
    }

    // Method to reverse a string
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(); // Use StringBuilder for efficient string manipulation

        // Loop through the string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i)); // Append each character to the StringBuilder
        }

        return reversed.toString(); // Convert StringBuilder back to string
	}

}
