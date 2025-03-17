package QuestionSolves;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SetB_1 {

	public static void main(String[] args) {
		// Specify the file path for reading input

		File inputFile = new File("/home/nilanjana/Java Programs/playerData.txt");
		BufferedReader fileReader = null;
		// Initialize a map to store player names and their corresponding salaries
		Map<String, Integer> playerSalaries = new HashMap<String, Integer>();

		try {
			// Initialize BufferedReader to read from the file
			fileReader = new BufferedReader(new FileReader(inputFile));
			String currentLine = fileReader.readLine(); // Skip the header or first line

			// Read each line of the file and process it
			while ((currentLine = fileReader.readLine()) != null) {
				// Split the line using tab spaces ( four spaces as delimiter )
				String[] tokens = currentLine.split(" ");
				int salary = 0; // Initialize salary

				// Check if salary is marked as " Null " , assign 0 , otherwise convert the
				// value
				if (tokens[1].equals(" Null ")) {
					playerSalaries.put(tokens[0], salary); // Set salary to 0
				} else {
					salary = Integer.parseInt(tokens[1]); // Parse salary to an integer
					playerSalaries.put(tokens[0], salary); // Add player and salary to the map
				}

			}

			// Update the salary of " PlayerA " by adding 50 ,000 to the current salary
			int updatedSalary = playerSalaries.get(" PlayerA ");
			updatedSalary += 50000;
			playerSalaries.put(" PlayerA ", updatedSalary);
		} catch (IOException e) {
			// Handle any exceptions during file reading
			System.out.println(" Error : " + e);
		} finally {
			// Print out the updated player salary details
			for (String player : playerSalaries.keySet()) {
				System.out.println(player + " " + playerSalaries.get(player));
			}
			try {
				// Close the BufferedReader to release resources
				fileReader.close();
			} catch (IOException e2) {
				// Handle exceptions during closing the reader
				System.out.println(" Error closing reader : " + e2);
			}
		}

	}

}