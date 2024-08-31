package classworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionTest {

    public static void main(String[] args) {
        List<String> a1 = new ArrayList<>();
        a1.add("mango");
        a1.add("oranges");
        a1.add("grapes");

        for (String fruit : a1) {
            System.out.println(fruit);
        }
        System.out.println();

        Collections.sort(a1);
        for (String fruit : a1) {
            System.out.println(fruit);
        }
        System.out.println();
        String key = "oranges";
        System.out.println("\nSearching for:" + key);

        int result = Collections.binarySearch(a1, key);

        System.out.println((result >= 0 ? "Found at index " + result : "Not found (" + result + ")"));
    }
}
