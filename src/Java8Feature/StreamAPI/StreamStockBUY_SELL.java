package Java8Feature.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamStockBUY_SELL {
    public static void main(String[] args) {
        ArrayList<Order> orderBook = new ArrayList<>();
        Order buyGoogle = new Order("GOOG.NS", 300, 900.30, Order.Side.BUY);
        Order sellGoogle = new Order("GOOG.NS", 600, 890.30, Order.Side.SELL);
        Order buyApple = new Order("APPL.NS", 400, 552, Order.Side.BUY);
        Order sellApple = new Order("APPL.NS", 200, 550, Order.Side.SELL);
        Order buyGS = new Order("GS.NS", 300, 130, Order.Side.BUY);

        orderBook.add(sellApple);
        orderBook.add(buyApple);
        orderBook.add(sellGoogle);
        orderBook.add(buyGoogle);
        orderBook.add(buyGS);

        // Java 8 Streams Example 1 : Filtering Collection elements
        // Filtering buy and sell order using filter() method of java.util.Stream class
        System.out.println("...............................All Product..............................");
        orderBook.forEach(System.out::println);
        System.out.println("...............................Count BUY & SELL Orders ..............................");
        Stream<Order> streams = orderBook.stream();
        Stream<Order> buyOrders = streams.filter((Order o) -> o.side().equals(Order.Side.BUY));
        System.out.println("No of Buy Order Placed :" + buyOrders.count());
        Stream<Order> sellOrders = orderBook.stream().filter((Order o) -> o.side().equals(Order.Side.SELL));
        System.out.println("No of Sell Order Placed :" + sellOrders.count());

        // Java 8 Streams Example 2 : Reduce or Fold operation
        // Calculating total value of all orders
        double values = orderBook.stream().mapToDouble((Order o) -> o.price()).sum();
        System.out.println("Total value of all orders : " + values);
        long quantity = orderBook.stream().mapToLong((Order o) -> o.quantity()).sum();
        System.out.println("Total quantity of all orders : " + quantity);
        System.out.println("...............................Get All the product price Greater Than 650 and BUY & SELL Orders ..............................");
        List<Order> filterOrder2 = orderBook.stream().filter(order -> order.price() > 650 && order.side() == Order.Side.SELL).collect(Collectors.toList());
        filterOrder2.forEach(System.out::println);

        List<Order> filterOrder = orderBook.stream().filter(order -> order.price() > 650 && order.side() == Order.Side.BUY).collect(Collectors.toList());
        filterOrder.forEach(System.out::println);
        System.out.println("...............................Get All the  SELL Orders ..............................");
        List<Order> getSELLPRoduct = orderBook.stream().filter(order -> order.side() == Order.Side.SELL).collect(Collectors.toList());
        getSELLPRoduct.forEach(System.out::println);

        List<Double> newProductList = orderBook.stream().filter(order -> order.price() > 500 && order.price() < 775).map(order -> order.price() + 50).collect(Collectors.toList());
        newProductList.forEach(System.out::println);

        List<Order> anotherList = orderBook.stream().map(order -> {
            if (order.price() > 500 && order.price() < 700) {
                order.price(order.price() + 50);
            } else if (order.price() > 700) {
                order.price(order.price() + 100);
            }
            return order;
        }).filter(order -> order.side() == Order.Side.BUY).collect(Collectors.toList());
        anotherList.forEach(System.out::println);

    }
}
