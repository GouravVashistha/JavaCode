package Java8Feature.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

//      5. Given the list of integers, find the first element of the list using stream Function?

        List<Integer> list = Arrays.asList(10, 2, 4, 5, 6);
        Optional<Integer> firstElement = list.stream().findFirst();
        if(firstElement.isPresent()){
            System.out.println(firstElement.get());
        }

//      6. Given a list of integers, find the total number of elements present in the list using Stream functions?
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        long countElement = list1.stream().count();
        System.out.println(countElement);

//      7. Given a list of integers, find the maximum value element present in it using Stream functions?
        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 55, 33, 77);
        Integer maxValue = list3.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println(maxValue);
        //Another way
        Optional<Integer> maxValue1 = list3.stream().max(Integer::compare);
        if(maxValue1.isPresent()){
            System.out.println(maxValue1.get());
        }

//      8. Given a list of integers, sort all the values present in it in descending order using Stream functions?
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 77, 6, 7, 8);
        List<Integer> revList = list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(revList);

//      9.
        ArrayList<String> namess = new ArrayList<>();
        namess.add("Gaurav");
        namess.add("Yash jain");
        namess.add("shabbir");
        Stream<String> listName = namess.stream();
        namess.forEach(System.out::println);

//      10. Given a list of integers, find out all the even numbers exist in the list using Stream functions?
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        myList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

//      11. remove duplicate number frome the list
        List<Integer> oldList = Arrays.asList(1,2,3,3,4,5,6,6,5,4,8,9,0);
        List<Integer> newList = oldList.stream().distinct().collect(Collectors.toList());
        System.out.println(newList);
    }

}
