package JavaBasicCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestSalary {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 2, 5, 6);

        // Remove duplicates using distinct() and collect into a list
        List<Integer> second = numbers.stream().distinct().collect(Collectors.toList());

        // Sort in descending order by passing reverseOrder() comparator
        Collections.sort(second, Collections.reverseOrder());

        // Check if the list has more than one unique element
        if (second.size() > 1) {
            int secondLargest = second.get(1); // Get second largest element
            System.out.println(secondLargest);
        } else {
            System.out.println("Not enough unique elements to find the second largest.");
        }
    }
}
