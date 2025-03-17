package QuestionSolves;

import java.io.*;


public class MaxBooks {
	public static void main(String[] args) {
		String inputFileName = "/home/nilanjana/Java Programs/bookData.txt";
		String outputFileName = "/home/nilanjana/Java Programs/max.txt";

		String courseWithMaxBooks = "";
		int maxBooks = 0;

		try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
			String line;
			while ((line = reader.readLine()) != null) {
				// Split the line into course name and number of books
				String[] parts = line.split("-");
				String courseName = parts[0];
				int numberOfBooks = Integer.parseInt(parts[1]);

				// Check if this course requires more books
				if (numberOfBooks > maxBooks) {
					maxBooks = numberOfBooks;
					courseWithMaxBooks = courseName;
				}
			}
		} catch (IOException e) {
			System.out.println("Error reading the input file: " + e.getMessage());
			return;
		}

		// Write the result to the output file
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
			writer.write(courseWithMaxBooks + "-" + maxBooks);
		} catch (IOException e) {
			System.out.println("Error writing to the output file: " + e.getMessage());
		}

		System.out.println("The course with the maximum number of books is written to " + outputFileName);
	}
}
