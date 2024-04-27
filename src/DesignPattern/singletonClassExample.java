package DesignPattern;

class Singleton{
    private static Singleton single_instance = null;
    int i = 0;
    private  Singleton(){
        int i = 90;
    }
    public static Singleton getInstance(){
        if(single_instance == null)
        {
            single_instance = new Singleton();
        }
        return single_instance;
    }
}
public class singletonClassExample {
    public static void main(String[] args) {
        Singleton first = Singleton.getInstance();
        System.out.println("First instance integer value:"+first.i);
        first.i=first.i+90;
        Singleton second = Singleton.getInstance();
        System.out.println("Second instance integer value:"+second.i);
    }
}
