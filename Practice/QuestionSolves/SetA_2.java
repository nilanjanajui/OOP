package QuestionSolves;

import java.util.Map;
import java.util.TreeMap;

public class SetA_2 {

	public static void main(String[] CSECU) {
// Define the input string ( sentence ) where we need to find the largest word
		String str = " When God closes all the doors somewhere somewhera he leaves a little window open ";

// Get a TreeMap that stores each word as a key and its length as the value
		Map<String, Integer> mymap = getTheTreeMap(str);

// Variables to keep track of the word with the maximum length
		int max = 0;

		String maxi = " "; // Initially , the largest word is set to an empty space

// Loop through each word in the TreeMap
		for (String word : mymap.keySet()) {
// If the current word ’s length is greater than or equal to the current max length ,
// update ’ maxi ’ to be the current word and ’ max ’ to be the word ’s length
			if (max <= mymap.get(word)) {
				maxi = word;
				max = mymap.get(word);
			}
		}

// Output the word with the largest length and the number of letters it has
		System.out.println(maxi + " is the largest word which has " + max + " letters ");

	}

// Method to create a TreeMap that maps each word in the input string to its length
	public static Map<String, Integer> getTheTreeMap(String str) {
// Create a TreeMap to store the words and their lengths
		Map<String, Integer> map = new TreeMap<>();

// Split the input string into individual words using spaces as the delimiter
		String[] devide = str.split(" ");

// Loop through each word in the ’ devide ’ array
		for (int a = 0; a < devide.length; a++) {
			String word = devide[a];
// Put the word and its length into the TreeMap
			map.put(word, word.length());
		}

// Return the TreeMap containing words and their lengths
		return map;

	}

}