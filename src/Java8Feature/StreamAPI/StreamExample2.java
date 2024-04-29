package Java8Feature.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class StreamExample2 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1, "Shoes", 344f));
        productList.add(new Product(2, "shirt", 588f));
        productList.add(new Product(3, "pent", 658f));
        productList.add(new Product(4, "watch", 150f));

        // Find the product having Price Greater than 500 .
        List<Float> newProduct = productList.stream().filter(p -> p.price > 500).map(p -> p.price).collect(Collectors.toList());
        System.out.println("prducts having price more than 500: " + newProduct);

        // Find the product having price 588.
        productList.stream().filter(o -> o.price == 588).forEach(o -> System.out.println("Name Of the product having price 588: " + o.name));

        // Find the sum of the all product .
        double sumOfProduct = productList.stream().mapToDouble(product -> product.price).sum();
        System.out.println("Sum of all products: " + sumOfProduct);
        // ALternative way

        Float sumOfProducts1 = productList.stream().map(product -> product.price).reduce(0.0f, Float::sum);
        System.out.println("Sum of all products: " + sumOfProducts1);

        // Find max and min price in the list
        Optional<Float> maxPrice = productList.stream().map(p -> p.price).max(Float::compareTo);
        if (maxPrice.isPresent()) {
            System.out.println("Max price: " + maxPrice.get());
        }
        Optional<Float> minPrice = productList.stream().map(p -> p.price).min(Float::compareTo);
        if (minPrice.isPresent()) {
            System.out.println("Min price: " + minPrice.get());
        }
        // Alternative method
        Product productMAX = productList.stream().max((p1, p2) -> p1.price > p2.price ? 1 : -1).get();
        Product productMIN = productList.stream().min((p1, p2) -> p1.price > p2.price ? 1 : -1).get();
        System.out.println("MAX :" + productMAX.price + " MIN :" + productMIN.price);

        // count Number of Product in the list price greater than 500
        long count = productList.stream().filter(p -> p.price > 500).count();
        System.out.println("product more the 500 : " + count);
    }
}
