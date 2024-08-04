package Java8Feature.MethodRefernce;

public class MethodReferenceExample3 {
    public  static void ThreadCall(){
        System.out.println("Thread is Running...!");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(MethodReferenceExample3::ThreadCall);
        t1.start();
    }

}
