package DSA.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> newArr = new ArrayList<>();
        newArr.add(1);
        newArr.add(2);
        newArr.addFirst(3);
        newArr.addLast(4);
        newArr.contains(3);
        System.out.println(newArr);
    }
}
