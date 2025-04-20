package Java8Feature.LambadaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface  printer{
    void print();
}

@FunctionalInterface
interface adder{
    int add(int a,int b);
}
public class ShowExampleOfLambda {
    public  static void main(String args[]){
        //    Q1. Print “Hello Lambda” using Lambda Expression
        printer p = () -> System.out.println("Hello lambda");
        p.print();

        //     Q2. Add two numbers using Lambda
        adder add = (a, b) -> a + b;
        System.out.println("Sum: " + add.add(5, 4));

        //     Q4. Sort a list using Lambda

        List<String> names = Arrays.asList("Gaurav", "Jatin", "Dimple", "Komal");
        Collections.sort(names, (x, y) -> x.compareTo(y));

        names.forEach(System.out::println);

        // Q5. Filter even numbers from a list
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        List<Integer> l1= list.stream().map(n -> n * n).toList();
        System.out.println(l1);
        l1.forEach(System.out::println);

        // Q10. Count words starting with 'A'
        List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Cherry");
        long count = words.stream().filter(w -> w.startsWith("A")).count();
        System.out.println(count);


    }
}
