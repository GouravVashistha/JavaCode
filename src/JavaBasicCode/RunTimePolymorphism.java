package JavaBasicCode;

class Bike{
    void run(){
        System.out.println("running");
    }
}

class suplender extends Bike{
    void run(){
        System.out.println("running safely with 60km");
    }

}
public class RunTimePolymorphism {
    public static void main(String[] args) {
        Bike b = new suplender();
        b.run();
    }
}
