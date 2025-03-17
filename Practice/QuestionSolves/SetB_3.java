package QuestionSolves;

import java.io.*;

public class SetB_3 {

	public static void main(String[] args) {
// Specify the file path for reading input

		File inputFile = new File("/home/nilanjana/Java Programs/truthtable.txt");
		BufferedReader fileReader = null;

// Variables to store confusion matrix values
		int truePositive = 0, falsePositive = 0, falseNegative = 0, trueNegative = 0;

		try {
// Initialize BufferedReader to read from the file
			fileReader = new BufferedReader(new FileReader(inputFile));
			String currentLine = fileReader.readLine(); // Skip the header or first line

// Read each line of the file and process it
			while ((currentLine = fileReader.readLine()) != null) {
// Split the line using tab spaces ( four spaces as delimiter )
				String[] tokens = currentLine.split(" ");

// Update confusion matrix based on expected and actual labels
				if (tokens[1].charAt(0) == 'F' && tokens[2].charAt(0) == 'F') {
					truePositive++;
				} else if (tokens[1].charAt(0) == 'A' && tokens[2].charAt(0) == 'F') {
					falsePositive++;
				} else if (tokens[1].charAt(0) == 'F' && tokens[2].charAt(0) == 'A') {
					falseNegative++;
				} else {
					trueNegative++;
				}

			}

// Print the confusion matrix

			System.out.println(" True Positives = " + truePositive + " False Positives = " + falsePositive);
			System.out.println(" False Negatives = " + falseNegative + " True Negatives = " + trueNegative);

// Calculate performance metrics : recall , precision , F1 - score , and accuracy
			double recall = (double) truePositive / (truePositive + falseNegative);
			double precision = (double) truePositive / (truePositive + falsePositive);
			double f1Score = (double) (2 * precision * recall) / (precision + recall);
			double accuracy = (double) (truePositive + trueNegative)
					/ (truePositive + falsePositive + falseNegative + trueNegative);

// Print calculated metrics
			System.out.println(" Recall = " + recall);
			System.out.println(" Precision = " + precision);
			System.out.println(" F1 - Score = " + f1Score);
			System.out.println(" Accuracy = " + accuracy);
		} catch (IOException e) {
// Handle any exceptions during file reading
			System.out.println(" Error : " + e);
		} finally {
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


