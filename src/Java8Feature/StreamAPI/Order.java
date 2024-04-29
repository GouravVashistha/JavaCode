package Java8Feature.StreamAPI;

public class Order {
    enum Side{
        BUY,SElL;
    }

    private final String symbol;
    private final int quantity;
    private double price;
    private final Side side;

    public Order(String symbol,int quantity,double price,Side side){
        super();
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        this.side = side;
    }

    // This method returns the current price of the order.
    public double price(){
        return price;
    }
    // This method allows updating the price of the order.
    public void price(double price){
        this.price = price;
    }
    // This method returns the symbol of the financial instrument.
    public String symbol(){
        return  symbol;
    }
    // This method returns the side of the order (BUY or SELL).
    public Side side() {
        return side;
    }
    // This method returns the quantity of the financial instrument.
    public int quantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", side=" + side +
                '}';
    }
}
