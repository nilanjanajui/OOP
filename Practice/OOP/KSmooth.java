package OOP;

import java.util.ArrayList;
import java.util.List;

public class KSmooth {
    // Method to check if a number is K-smooth
    public static boolean isKSmooth(int num, int k) {
        if (num < 2) return true; // Edge case: 1 is considered K-smooth as it has no prime factors.

        for (int factor = 2; factor <= num; factor++) {
            while (num % factor == 0) {
                if (factor > k) return false; // If any prime factor exceeds K, return false
                num /= factor;
            }
        }
        return true; // All prime factors are <= K
    }

    // Method to generate all K-smooth numbers up to a given limit
    public static List<Integer> generateKSmoothNumbers(int limit, int k) {
        List<Integer> kSmoothNumbers = new ArrayList<>();

        for (int i = 1; i <= limit; i++) {
            if (isKSmooth(i, k)) {
                kSmoothNumbers.add(i); // Add to the list if it is K-smooth
            }
        }

        return kSmoothNumbers;
    }

    public static void main(String[] args) {
        int k = 5; // K value
        int limit = 50; // Upper limit

        System.out.println("K-Smooth Numbers:");
        List<Integer> kSmoothNumbers = generateKSmoothNumbers(limit, k);

        System.out.println("K = " + k + ", Limit = " + limit);
        System.out.println(kSmoothNumbers);
    }
}
