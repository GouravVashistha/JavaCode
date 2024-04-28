package Java8Feature.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
//     1. Given a list of integers, find out all the numbers starting with 1 using Stream Function ?
       List<Integer> number =  Arrays.asList(123, 456, 178, 198, 102, 703, 101);
       List<Integer> ones = number.stream().filter(n->String.valueOf(n).startsWith("1")).collect(Collectors.toList());
       System.out.println(ones);



    }
}
