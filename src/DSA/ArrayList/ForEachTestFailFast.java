package DSA.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEachTestFailFast {
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
//            nameList.remove(2); // It gives ConcurrentModificationException (fail-fast behavior)
        }
        System.out.println("****************************");

        // Create an explicit iterator to traverse the list
        Iterator<String> player = nameList.iterator();

        // Iterate over the list using the iterator
        while (player.hasNext()) {
            // Get the next element in the list
            String current = player.next();

            // Check if the current element is "Sachin"
            if (current.equals("Sachin")) {
                // Use iterator's remove() method to safely remove the current element
                // This method is safe to use because it updates the iterator's internal state
                player.remove();
            }
        }

        // Iterate over the modified nameList using a for-each loop again
        // This will print the list after "Sachin" has been removed
        for (String names : nameList) {
            System.out.println(names);
        }
    }
}
