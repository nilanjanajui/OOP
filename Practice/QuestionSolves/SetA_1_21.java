package QuestionSolves;

import java.io.*; // Importing necessary classes for input-output operations
import java.util.*; // Importing utility classes

public class SetA_1_21 {
	public static void main(String[] args) {
		String inputFileName = "data.txt"; // Name of the input file
		int numDistricts = 64; // Number of districts
		int numDays = 365; // Number of days in a year

// Maps to store the sum of each attribute for each district
		Map<Integer, Integer> temperatureSum = new HashMap<>();
		Map<Integer, Integer> humiditySum = new HashMap<>();
		Map<Integer, Integer> rainSum = new HashMap<>();
// Initialize the maps
		for (int i = 1; i <= numDistricts; i++) {
			temperatureSum.put(i, 0); // Initialize temperature sum for each district
			humiditySum.put(i, 0); // Initialize humidity sum for each district
			rainSum.put(i, 0); // Initialize rain sum for each district
		}
// Read the file and update the sums
		try (BufferedReader br = new BufferedReader(new FileReader(inputFileName))) {
			String line;
			while ((line = br.readLine()) != null) { // Read each line from the file
				String[] data = line.split(" "); // Split the line by spaces
				int districtId = Integer.parseInt(data[0]); // Parse district ID
				int temperature = Integer.parseInt(data[2]); // Parse temperature
				int humidity = Integer.parseInt(data[3]); // Parse humidity
				int rain = Integer.parseInt(data[4]); // Parse rain
// Update the sums for each attribute
				temperatureSum.put(districtId, temperatureSum.get(districtId) + temperature);
				humiditySum.put(districtId, humiditySum.get(districtId) + humidity);
				rainSum.put(districtId, rainSum.get(districtId) + rain);
			}
		} catch (IOException e) {
			e.printStackTrace(); // Print the stack trace if an exception occurs
		}
// Calculate the averages and write to files
		try (PrintWriter temperatureWriter = new PrintWriter("temperature.txt");
				PrintWriter humidityWriter = new PrintWriter("humidity.txt");
				PrintWriter rainWriter = new PrintWriter("rain.txt")) {
// Write the average values for each district
			for (int i = 1; i <= numDistricts; i++) {
				double avgTemperature = temperatureSum.get(i) / (double) numDays; // Calculate average temperature
				double avgHumidity = humiditySum.get(i) / (double) numDays; // Calculate average humidity
				double avgRain = rainSum.get(i) / (double) numDays; // Calculate average rain
				temperatureWriter.println(i + " " + avgTemperature); // Write to temperature file
				humidityWriter.println(i + " " + avgHumidity); // Write to humidity file
				rainWriter.println(i + " " + avgRain); // Write to rain file
			}
		} catch (IOException e) {
			e.printStackTrace(); // Print the stack trace if an exception occurs
		}
	}
}
