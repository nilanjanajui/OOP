package QuestionSolves;

// SMC
public class SetA_3_21 {
	// Method to calculate the Simple Matching Coefficient (SMC)
	public static double calculateSMC(String x, String y) {
		if (x.length() != y.length()) { // Check if both strings have the same length
			throw new IllegalArgumentException("Binary strings must be of equal length"); // Ensure the strings are of
																							// equal
																							// length
		}
		int f01 = 0, f10 = 0, f00 = 0, f11 = 0; // Counters for the different attribute pairs
		// Iterate through each bit of the strings
		for (int i = 0; i < x.length(); i++) {
			char px = x.charAt(i); // Bit from string x
			char qy = y.charAt(i); // Bit from string y
			// Update the counters based on the pair of bits
			if (px == '0' && qy == '1') {
				f01++;
			} else if (px == '1' && qy == '0') {
				f10++;
			} else if (px == '0' && qy == '0') {
				f00++;
			} else if (px == '1' && qy == '1') {
				f11++;
			}
		}

		// Calculate and return the SMC
		return (double) (f11 + f00) / (f01 + f10 + f11 + f00);
	}

	public static void main(String[] args) {
		String x = "1000000000"; // First binary string
		String y = "0000001001"; // Second binary string
		double smc = calculateSMC(x, y); // Calculate the SMC
		System.out.println("SMC: " + smc); // Output the SMC
	}
}