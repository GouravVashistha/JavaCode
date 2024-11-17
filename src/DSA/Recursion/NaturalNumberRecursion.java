package DSA.Recursion;

// in this program we print  natural Numbers 

public class NaturalNumberRecursion {
    static void PI(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        PI(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        PI(10);
    }
}
