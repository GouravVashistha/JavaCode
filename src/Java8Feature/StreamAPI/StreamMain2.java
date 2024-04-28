package Java8Feature.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain2 {
    public static void main(String[] args) {

        // Stream API - collection process.
        // Collection/ Group of Object.

        // 1. Blank Stream ( In this stream you can profrom evey action on the stream Object.)
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e->{
            System.out.println(e);
        });

        // 2. array,object,collection'
        String names[] = {"Gaurav","Sidharth","Shabbir","Ankit","Bhupesh"};
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e->{
            System.out.println(e);
        });

        // 3 builder
        Stream<Object> streamBuilder = Stream.builder().build();

        // 4
        IntStream stream = Arrays.stream(new int[]{2, 3, 4, 54, 32, 7, 324});
        stream.forEach(e->{
            System.out.println(e);
        });

        // 5 list,set
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(34);
        list2.add(23);
        list2.add(78);

        Stream<Integer> stream3 = list2.stream();
        stream3.forEach(e->{
            System.out.println(e);
        });

    }
}
