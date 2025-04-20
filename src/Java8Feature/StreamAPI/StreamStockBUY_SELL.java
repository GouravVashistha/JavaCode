package Java8Feature.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamStockBUY_SELL {

    public static void main(String[] args) {

        // Create an order book to hold multiple stock orders
        ArrayList<Order> orderBook = new ArrayList<>();

        // Create different stock orders (BUY and SELL)
        Order buyGoogle = new Order("GOOG.NS", 300, 900.30, Order.Side.BUY);
        Order sellGoogle = new Order("GOOG.NS", 600, 890.30, Order.Side.SELL);
        Order buyApple = new Order("APPL.NS", 400, 552, Order.Side.BUY);
        Order sellApple = new Order("APPL.NS", 200, 550, Order.Side.SELL);
        Order buyGS = new Order("GS.NS", 300, 130, Order.Side.BUY);

        // Add all created orders to the orderBook list
        orderBook.add(sellApple);
        orderBook.add(buyApple);
        orderBook.add(sellGoogle);
        orderBook.add(buyGoogle);
        orderBook.add(buyGS);

        // Display all orders from the order book
        System.out.println("............................... All Products ..............................");
        orderBook.forEach(System.out::println);

        // Count the number of BUY and SELL orders using filter and count
        System.out.println("............................... Count BUY & SELL Orders ..............................");

        // Note: Streams can only be consumed once. Reuse by creating new streams.
        Stream<Order> streams = orderBook.stream();

        // Filter BUY orders and count them
        Stream<Order> buyOrders = streams.filter(order -> order.side().equals(Order.Side.BUY));
        System.out.println("No of Buy Orders Placed: " + buyOrders.count());

        // Filter SELL orders and count them
        Stream<Order> sellOrders = orderBook.stream().filter(order -> order.side().equals(Order.Side.SELL));
        System.out.println("No of Sell Orders Placed: " + sellOrders.count());

        // Calculate the total price and quantity of all orders
        System.out.println("............................... Total Value and Quantity of Orders ..............................");

        // Sum up all prices
        double totalValue = orderBook.stream()
                .mapToDouble(Order::price) // extract price from each order
                .sum();
        System.out.println("Total value of all orders: " + totalValue);

        // Sum up all quantities
        long totalQuantity = orderBook.stream()
                .mapToLong(Order::quantity) // extract quantity from each order
                .sum();
        System.out.println("Total quantity of all orders: " + totalQuantity);

        // Filter SELL orders with price greater than 650
        System.out.println("............................... SELL Orders with Price > 650 ..............................");
        List<Order> expensiveSellOrders = orderBook.stream()
                .filter(order -> order.price() > 650 && order.side() == Order.Side.SELL)
                .collect(Collectors.toList()); // collect into list
        expensiveSellOrders.forEach(System.out::println);

        // Filter BUY orders with price greater than 650
        System.out.println("............................... BUY Orders with Price > 650 ..............................");
        List<Order> expensiveBuyOrders = orderBook.stream()
                .filter(order -> order.price() > 650 && order.side() == Order.Side.BUY)
                .collect(Collectors.toList());
        expensiveBuyOrders.forEach(System.out::println);

        // Get and print all SELL orders
        System.out.println("............................... All SELL Orders ..............................");
        List<Order> allSellOrders = orderBook.stream()
                .filter(order -> order.side() == Order.Side.SELL)
                .collect(Collectors.toList());
        allSellOrders.forEach(System.out::println);

        // For orders with price between 500 and 775, add 50 and collect the new prices in a list
        System.out.println("............................... Modified Prices (Price + 50) for Orders Between 500-775 ..............................");
        List<Double> updatedPrices = orderBook.stream()
                .filter(order -> order.price() > 500 && order.price() < 775) // price in range
                .map(order -> order.price() + 50) // add 50 to price
                .collect(Collectors.toList());
        updatedPrices.forEach(System.out::println);

        // Conditionally update order prices and filter only BUY orders
        System.out.println("............................... Conditionally Updated BUY Orders ..............................");

        List<Order> updatedOrders = orderBook.stream()
                .map(order -> {
                    // If price is between 500 and 700, add 50
                    if (order.price() > 500 && order.price() < 700) {
                        order.price(order.price() + 50);
                    }
                    // If price is greater than 700, add 100
                    else if (order.price() > 700) {
                        order.price(order.price() + 100);
                    }
                    return order;
                })
                .filter(order -> order.side() == Order.Side.BUY) // only keep BUY orders
                .collect(Collectors.toList());

        updatedOrders.forEach(System.out::println); // print updated BUY orders
    }
}
