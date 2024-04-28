package Java8Feature.StreamAPI;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
//     1. Given a list of integers, find out all the numbers starting with 1 using Stream Function ?
       List<Integer> number =  Arrays.asList(123, 456, 178, 198, 102, 703, 101);
       List<Integer> ones = number.stream().filter(n->String.valueOf(n).startsWith("1")).collect(Collectors.toList());
       System.out.println(ones);

//      2.Given a list of String, find out all the string starting with a using Stream function?

        List<String> str = Arrays.asList("abc", "def", "fgh", "klm", "akze");
        List<String> newStr = str.stream().filter(e -> e.startsWith("a")).collect(Collectors.toList());
        System.out.println(newStr);
        // Another Way
        List<String> newStr1 = str.stream().filter(n->String.valueOf(n).startsWith("a")).collect(Collectors.toList());
        System.out.println(newStr1);

//      3.write a string program which accept 22,42,56,39 need to pick up those words end with 2?
        String input = "22,42,56,39";
        List<String> numbers = Arrays.asList(input.split(","));
        List<String> selectedNumber  = numbers.stream().filter(n->n.endsWith("2")).collect(Collectors.toList());
        System.out.println(selectedNumber);

//       4. How to find duplicate elements in a given integers list in java using Stream functions?
        List<Integer> number1 = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 5, 5);
        List<Integer> duplicateNumber = number1.stream()
                .filter(n-> Collections.frequency(number1,n)>1) // Filters elements with frequency > 1
                .distinct()  // Removes duplicates
                .collect(Collectors.toList());
        System.out.println(duplicateNumber);

        // ANother way
//        Set<Integer> set = new HashSet<>();
//        number1.stream().filter(n->!set.add(n)).forEach(System.out::println);



    }
}
