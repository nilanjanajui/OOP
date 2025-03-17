package QuestionSolves;

import java.util.Random; // Importing Random class for generating random numbers

class ParallelMin implements Runnable {
	private int[] numbers; // Array to find the minimum from
	private int startIndex, endIndex; // Indices for the segment of the array
	private int minValue; // Minimum value in the segment
// Constructor to initialize the segment

	public ParallelMin(int[] numbers, int startIndex, int endIndex) {
		this.numbers = numbers;
		this.startIndex = startIndex;
		this.endIndex = endIndex;
	}

	@Override
	public void run() {
		minValue = numbers[startIndex]; // Initialize minValue with the first element in the segment
		for (int i = startIndex + 1; i < endIndex; i++) {
			if (numbers[i] < minValue) { // Update minValue if a smaller element is found
				minValue = numbers[i];
			}
		}
	}

	// Method to get the minimum value found by this thread
	public int getMinValue() {
		return minValue;
	}
}

class Main {
	public static void main(String[] args) {
		Random random = new Random();
		int[] numbers = new int[500]; // Array of 500 integers
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(); // Fill the array with random integers
		}
		int numThreads = 5; // Number of threads to use
		ParallelMin[] minFinders = new ParallelMin[numThreads]; // Array to hold the Runnable objects
		Thread[] threads = new Thread[numThreads]; // Array to hold the Thread objects
		int segmentSize = numbers.length / numThreads; // Size of each segment
		// Create and start the threads
		for (int i = 0; i < numThreads; i++) {
			int startIndex = i * segmentSize;
			int endIndex = (i == numThreads - 1) ? numbers.length : startIndex + segmentSize;
			minFinders[i] = new ParallelMin(numbers, startIndex, endIndex); // Create a ParallelMin object for the
																			// segment
			threads[i] = new Thread(minFinders[i]); // Create a Thread object
			threads[i].start(); // Start the thread
		}
		int overallMin = Integer.MAX_VALUE; // Variable to hold the overall minimum value
		try {
			for (int i = 0; i < numThreads; i++) {
				threads[i].join(); // Wait for the thread to finish
				int threadMin = minFinders[i].getMinValue(); // Get the minimum value found by the thread
				if (threadMin < overallMin) { // Update overallMin if a smaller value is found
					overallMin = threadMin;
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace(); // Print the stack trace if an exception occurs
		}
		System.out.println("Minimum value: " + overallMin); // Print the overall minimum value

	}
}