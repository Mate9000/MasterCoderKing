package javaExerciseSpecial;

import java.util.HashSet;
import java.util.Set;

public class Opdracht39 {

	public static void main(String[] args) {
		        // Define the digits to use
		        int[] digits = {1, 2, 3, 4};

		        // Set to hold unique three-digit numbers
		        Set<String> uniqueNumbers = new HashSet<>();

		        // Generate all unique three-digit combinations
		        for (int i = 0; i < digits.length; i++) {
		            for (int j = 0; j < digits.length; j++) {
		                for (int k = 0; k < digits.length; k++) {
		                    // Ensure all digits are unique
		                    if (i != j && j != k && i != k) {
		                        String number = "" + digits[i] + digits[j] + digits[k];
		                        uniqueNumbers.add(number); // Add to set to ensure uniqueness
		                    }
		                }
		            }
		        }

		        // Display the unique three-digit numbers
		        for (String number : uniqueNumbers) {
		            System.out.println(number);
		        }

		        // Output the total count of unique three-digit numbers
		        System.out.println("Total number of the three-digit-number is " + uniqueNumbers.size());
		    }
		}