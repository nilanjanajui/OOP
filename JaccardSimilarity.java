
import java.util.*;

public class JaccardSimilarity {
    public static void main(String[] args) {
        // Sample input strings
        String doc1Str = "Data is the new oil of the digital economy";
        String doc2Str = "Data is a new oil";

        // Concatenate the input strings
        String[] doc1Words = doc1Str.split("\\s+");
        String[] doc2Words = doc2Str.split("\\s+");

        // Find the union of doc1 and doc2
        Set<String> unionSet = new HashSet<>();
        unionSet.addAll(Arrays.asList(doc1Words));
        unionSet.addAll(Arrays.asList(doc2Words));

        // Find the intersection of doc1 and doc2
        Set<String> intersectionSet = new HashSet<>();
        for (String word : doc1Words) {
            if (Arrays.asList(doc2Words).contains(word)) {
                intersectionSet.add(word);
            }
        }

        // Calculate and print the Jaccard Similarity
        float jaccardSimilarity = (float) intersectionSet.size() / unionSet.size();
        System.out.println("Jaccard Similarity: " + jaccardSimilarity);
    }
}
