package DSA.Recursion;

public class FibonacciNumber {
    public static void withOutRecursion(int count){
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b);
        for(int i=2;i<count;i++){
            int c = a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }

    public static void withRecursion(int count){

    }
    public static void main(String[] args) {
        int count  = 10;
        withOutRecursion(count);

    }
}
