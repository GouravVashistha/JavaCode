package DSA.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> newArr = new ArrayList<>();
        newArr.add(1);
        newArr.add(2);
        newArr.addFirst(3);
        newArr.addLast(4);
        newArr.contains(3);
        System.out.println(newArr);
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Gaurav","jatin","Shabbir"));
        System.out.println(names);
        // iterat using for loop
        for(int i = 0;i<newArr.size();i++){
            int num = newArr.get(i);
            System.out.println(num);
        }
        // using for each loop
        for(String name:names){
            System.out.println(name);
        }

        Iterator<String> itr = names.iterator();
        while (itr.hasNext()){
            String letter = itr.next();
            System.out.println(letter);
        }

        //Searching
        ArrayList<String> strElements = new ArrayList<>(Arrays.asList("A","B","C","D","E"));
        for(String letter:strElements){
            if(letter.equals("D")){
                System.out.println("Element is found ");
                break;
            }
        }
        int index = strElements.indexOf("C");
        System.out.println("The elemenet found at the index of :"+index);

        // delete Element
        strElements.remove("C");
        System.out.println(strElements);
    }
}
