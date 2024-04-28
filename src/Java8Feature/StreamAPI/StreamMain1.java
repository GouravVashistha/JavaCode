package Java8Feature.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {
        // Create a List and filter all even number from list.
        // This list(list1) is a imutable we can not change in this list.
        List<Integer> list1 = List.of(2, 4, 50, 21, 22, 67);
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(34);
        list2.add(23);
        list2.add(78);

        List<Integer> list3 = Arrays.asList(23, 567, 12, 67, 24);

        // list1
        // without stream
        List<Integer> listEven = new ArrayList<>();
        for(Integer i:list1){
            if(i%2==0){
                listEven.add(i);
            }
        }
        System.out.println(list1);
        System.out.println(listEven);

        // using Stream APi

        Stream<Integer> stream = list1.stream();
        List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);
        // Another Way
        List<Integer> newList1 = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList1);

        // Find all the number Greater than 50;
        List<Integer> greaterThan = list1.stream().filter(i->i>10).collect(Collectors.toList());
        System.out.println(greaterThan);

    }
}
