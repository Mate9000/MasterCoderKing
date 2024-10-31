package javaExerciseSpecial;
import java.util.Scanner;

public class Opdracht33 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Input an integer: ");
        String input = scanner.nextLine(); // Read input as a string
        
        // Initialize variables for sum and numeric value
        int sum = 0;

        // Convert the string input to an integer
        int number = Integer.parseInt(input);
        
        // Use a while loop to calculate the sum of digits
        while (number != 0) {
            sum += number % 10; // Add the last digit to sum
            number /= 10;       // Remove the last digit
        }
        
        // Output the result
        System.out.println("The sum of the digits is: " + sum);
        
        // Close the scanner
        scanner.close();
    
    	}
    
    }

