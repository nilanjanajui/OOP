package Collection_Frameworks;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("List: " + list);
        System.out.println("Element at index 1: " + list.get(1));

        list.remove(2);
        System.out.println("After removing index 2: " + list);
    }
}
