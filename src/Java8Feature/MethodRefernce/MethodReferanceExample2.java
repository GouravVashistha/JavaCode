package Java8Feature.MethodRefernce;

interface  Sayable{
     void say();
}

public class MethodReferanceExample2 {
    public static void saySomething(){
        System.out.println("Hello, this is static method......!");
    }

    public static void main(String[] args) {
        Sayable sayable = MethodReferanceExample2::saySomething;
        sayable.say();
    }
}
