package Java8Feature.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample4 {
    public static void main(String[] args) {
        List<Integer> s1 = Arrays.asList(2, 4, 50, 21, 22, 67);
        List<Integer> ListEven = new ArrayList<>();
        for(Integer i:s1){
            if(i%2==0){
                ListEven.add(i);
            }
        }
        System.out.println(ListEven);

        List<Integer> newList1 = s1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList1);

        List<Integer> graterThanFifty = s1.stream().filter(i->i>50).collect(Collectors.toList());
        System.out.println(graterThanFifty);
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        String name[] = {"Gaurav","Sidharth","Shabbir","Ankit","Bhupesh"};
        Stream<String> s2 = Stream.of(name);
        s2.forEach(e->{
            System.out.println(e);
        });

        IntStream streamNum = Arrays.stream(new int[]{2, 3, 4, 54, 32, 7, 324});
        streamNum.forEach(e->{
            System.out.println(e);
        });
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        List<String> names1 =  Arrays.asList("Gaurav","Sidharth","Shabbir","Ankit","Bhupesh");
        List<Integer> numbers1 =  Arrays.asList(23, 4, 2, 5, 7, 6);

        // Find the name start with A
         List<String> newName1 = names1.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
         System.out.println(newName1);


         List<Integer> newNum = numbers1.stream().map(i -> i*i).collect(Collectors.toList());
         System.out.println(newNum);
         newNum.stream().sorted().forEach(System.out::println);





    }
}
