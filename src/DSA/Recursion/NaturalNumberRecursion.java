package DSA.Recursion;

// in this program we print  natural Numbers 

public class NaturalNumberRecursion {
    static void PI(int n) {
        if (n == 10) {
            System.out.println(n);
            return;
        }
        
        System.out.println(n);
        PI(n + 1);
    }


    public static void main(String[] args) {

        System.out.println(System.nanoTime());
        PI(1);
        System.out.println(System.nanoTime());
    }
}
