package javaExerciseSpecial;
import java.util.Scanner;
public class Opdracht36 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner scanner = new Scanner(System.in);

		        // Prompt the user for input
		        System.out.print("Input the latitude of coordinate 1: ");
		        double lat1 = scanner.nextDouble();

		        System.out.print("Input the longitude of coordinate 1: ");
		        double lon1 = scanner.nextDouble();

		        System.out.print("Input the latitude of coordinate 2: ");
		        double lat2 = scanner.nextDouble();

		        System.out.print("Input the longitude of coordinate 2: ");
		        double lon2 = scanner.nextDouble();

		        // Radius of the earth in kilometers
		        double radius = 6371.01;

		        // Convert latitudes and longitudes from degrees to radians
		        lat1 = Math.toRadians(lat1);
		        lon1 = Math.toRadians(lon1);
		        lat2 = Math.toRadians(lat2);
		        lon2 = Math.toRadians(lon2);

		        // Calculate the distance using the formula
		        double distance = radius * Math.acos(Math.sin(lat1) * Math.sin(lat2) +
		                Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));

		        // Output the result
		        System.out.println("The distance between those points is: " + distance + " km");

		        // Close the scanner
		        scanner.close();
		    }
}
