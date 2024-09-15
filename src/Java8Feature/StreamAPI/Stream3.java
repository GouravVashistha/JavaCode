package Java8Feature.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Products{
    int id;
    String name;
    float price;

    public Products(int id, String name, float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Stream3 {
    public static void main(String[] args) {
        List<Products> prodList  = new ArrayList<Products>();
        // Fixed the class name 'Products' in prodList.add() calls
        prodList.add(new Products(1,"HP Laptop",25000f));
        prodList.add(new Products(2,"Dell Laptop",30000f));
        prodList.add(new Products(3,"Lenevo Laptop",28000f));
        prodList.add(new Products(4,"Sony Laptop",28000f));
        prodList.add(new Products(5,"Apple Laptop",90000f));

        List<String> str = Arrays.asList("abc", "def", "fgh", "klm", "akze");
        // without stream
        List<Float> productPriceList = new ArrayList<Float>();
        for(Products prods : prodList){
            if(prods.price < 30000){ // Condition changed to more than 30000
                // Fixed to add the price to the List<Float>
                productPriceList.add(prods.price);
            }
        }
        System.out.println(productPriceList);

        // with stream
        List<Float> l1 = prodList.stream().filter(e -> e.price < 30000).map(e -> e.price).collect(Collectors.toList());
        System.out.println(l1);

        prodList.stream().filter(e->e.price==30000).forEach(p-> System.out.println(p.name));

        List<String> l2 = str.stream().filter(p -> p.startsWith("f")).collect(Collectors.toList());
        System.out.println(l2);

        List<String> l3 = prodList.stream()
                .filter(p -> p.name.startsWith("S"))
                .map(p->p.name)
                .collect(Collectors.toList());
        System.out.println(l3);

        double sum = prodList.stream().mapToDouble(p -> p.price).sum();
        System.out.println(sum);

        Products p11 = prodList.stream().max((p1, p2) -> p1.price > p2.price ? 1 : -1).get();
        System.out.println(p11.price);


        List<String> s1 = prodList.stream()
                .map(a -> a.name)
                .sorted(Comparator.reverseOrder()) // Sorting in descending order
                .collect(Collectors.toList());
        System.out.println(s1);

        List<Products> s2 = prodList.stream().sorted(Comparator.comparing(p -> p.name)).collect(Collectors.toList());
        s2.forEach(p-> System.out.println(p.name+p.id));

    }
}
