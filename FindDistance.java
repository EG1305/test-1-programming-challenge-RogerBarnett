/* Roger Barnett
 * Dr.Aktunc
 * Test 1 
 * This is a code to find the distance between two given points by the user. */

import java.util.Scanner;

public class FindDistance {

	// Method to find the distance between two points
	public static double getDistance(double x1, double y1, double x2, double y2) {
		double distance;
		distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1),2) ); // Euclidean distance formula for two points
		return distance;
	}
	
	// Method to Classify the Distance
	public static String classifyDistance(double distance) {
		if (distance < 5) { // distance less than 5 is short
			return "Short";
		}
		else if (distance > 15) { // distance greater than 15 is long
			return "Long";
		}
		else {
			return "Medium"; // distance between 5 and 15 must be medium
		}
	}

	public static void main(String[] args) {
		// Initialize Scanner
		Scanner scanner = new Scanner(System.in);

		// Tell user what to do
		System.out.println("The program will calculate the distance between two points");
		System.out.println("Please enter the x and y values for the first point");

		// Get x1
		System.out.println("x:");
		double x1 = scanner.nextDouble();
		scanner.nextLine();

		// Get y1
		System.out.println("y:");
		double y1 = scanner.nextDouble();
		scanner.nextLine();

		System.out.println("Please enter the x and y values for the second point");

		// Get x2
		System.out.println("x:");
		double x2 = scanner.nextDouble();
		scanner.nextLine();

		// Get y2
		System.out.println("x:");
		double y2 = scanner.nextDouble();
		scanner.nextLine();
		
		// Get distance
		double distance = getDistance(x1,y1,x2,y2);
		
		//Format distance
		String formattedDistance = String.format("%.2f", distance);
		
		// Print results
		System.out.println("The distance between these two points is " + formattedDistance);
		System.out.println("Classification: " + classifyDistance(distance));

		// Close Scanner
		scanner.close();
	}
}
