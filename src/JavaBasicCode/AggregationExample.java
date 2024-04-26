package JavaBasicCode;

/*
    Aggregation can be defined as the relationship between two classes where the aggregate
    class contains a reference to the class it owns.
 */

class Address{
    String city,state,country;
    public Address(String city,String state,String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Emp{
    int id;
    String name;
    Address address;

    public Emp(int id,String name,Address address){
         this.id = id;
         this.name = name;
         this.address = address;
    }

    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Address add1 = new Address("gzb","UP", "India");
        Address add2 = new Address("GG", "HR", "India");
        Emp e1 = new Emp(1,"Gaurav",add1);
        Emp e2 = new Emp(2,"Jatin",add2);
        e1.display();
        e2.display();
    }
}
