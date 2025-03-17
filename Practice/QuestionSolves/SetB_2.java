package QuestionSolves;

import java.util.*;

public class SetB_2 {

	public static void main(String[] args) {
// Declare variables to store the coordinates
		double xCoordinate, yCoordinate;

// Initialize the scanner to take user input
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

// Read input for x and y coordinates from the user
		xCoordinate = scanner.nextDouble();
		yCoordinate = scanner.nextDouble();

// Determine the position of the point (x , y ) relation to the quadrants or in axes 
		if (xCoordinate == 0.0) {
// Point is on the Y - axis
			System.out.println(" ( " + xCoordinate + " ," + yCoordinate + " ) is on the Y -axis ");
		} else if (yCoordinate == 0.0) {
// Point is on the X - axis
			System.out.println(" ( " + xCoordinate + " ," + yCoordinate + " ) is on the X - axis ");
		} else if (xCoordinate > 0 && yCoordinate > 0) {
// Point is in Quadrant 1
			System.out.println(" ( " + xCoordinate + " ," + yCoordinate + " ) is in Quadrant 1. ");
		} else if (xCoordinate < 0 && yCoordinate > 0) {
// Point is in Quadrant 2
			System.out.println(" ( " + xCoordinate + " ," + yCoordinate + " ) is in Quadrant 2. ");
		} else if (xCoordinate < 0 && yCoordinate < 0) {
// Point is in Quadrant 3
			System.out.println(" ( " + xCoordinate + " ," + yCoordinate + " ) is in Quadrant 3. ");
		} else {
// Point is in Quadrant 4
			System.out.println(" ( " + xCoordinate + " ," + yCoordinate + " ) is in Quadrant 4. ");
		}

	}

}