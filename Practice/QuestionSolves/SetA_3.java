package QuestionSolves;

// Kappa's math

public class SetA_3 {

// Method to calculate Cohen ’s Kappa
	public static double calculateKappa(int[][] matrix) {
		int total = 0, po = 0;
		for (int a = 0; a < 2; a++) {
			for (int b = 0; b < 2; b++) {
				total += matrix[a][b];
			}
			po += matrix[a][a]; // Diagonal elements
		}

// Observed Agreement ( Po )
		double observedAgreement = (double) po / total;

// Expected Agreement ( Pe )
		double pFavor = ((double) (matrix[0][0] + matrix[0][1]) / total)
				* ((double) (matrix[0][0] + matrix[1][0]) / total);
		double pAgainst = ((double) (matrix[1][0] + matrix[1][1]) / total)
				* ((double) (matrix[0][1] + matrix[1][1]) / total);
		double expectedAgreement = pFavor + pAgainst;

// Kappa Calculation
		double kappa = (observedAgreement - expectedAgreement) / (1 - expectedAgreement);
		return kappa;

	}

	public static void main(String[] CSECU) {
// Confusion matrix for annotators ( from the image )
		int[][] matrix = { { 3, 2 }, // Favor ( row )
				{ 1, 4 } // Against ( row )
		};

// Calculate and print Kappa score
		double kappa = calculateKappa(matrix);
		System.out.println(" Cohen ’s Kappa : " + kappa);

	}

}