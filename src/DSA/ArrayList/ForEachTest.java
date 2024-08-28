package DSA.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachTest {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        List<String> listofName = Arrays.asList("Gaurav","Sachin","Rahul","vicky","Jatin","Sidharth");
        nameList.addAll(listofName);
        // Iterate over the nameList using a for-each loop
        for (String name : nameList) {
            // Print each name
            System.out.println(name);

            // Attempt to remove an element from nameList
            // This will throw a ConcurrentModificationException because
            // we are modifying the list while iterating over it.
            // The for-each loop uses an iterator internally, and modifying
            // the list directly (e.g., using remove()) during iteration
            // invalidates the iterator, leading to the exception.
            nameList.remove(2); // It gives ConcurrentModificationException (fail-fast behavior)
        }
    }
}
