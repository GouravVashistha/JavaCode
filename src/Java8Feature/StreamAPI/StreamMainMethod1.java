package Java8Feature.StreamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMainMethod1 {
    public static void main(String[] args) {
        /*
         Filter:- filter(predicate).
                  predicate means boolean value Function.
                  e->{
                  return true/False;
                  }
        
         Map:-  map(Function).
                On Each element we can proform operation.          

         */

        List<String> names = List.of("Gaurav","Sidharth","Shabbir","Ankit","Bhupesh");
        List<Integer> numbers = List.of(23, 4, 2, 5, 7, 6);

        // Find  the name from the list start with A.
        List<String> newNames = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNames);

        // Find squar of the Number
        List<Integer> newNumbers = numbers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(newNumbers);

        names.stream().forEach(
                e->{
                    System.out.println(e);
                }
        );
        // another way to print list using stream
//        names.stream().forEach(System.out::println);

        //sorted

        numbers.stream().sorted().forEach(System.out::println);

        Integer intValue = numbers.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println(intValue);

        Integer intValue1 = numbers.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println(intValue1);

    }
}
