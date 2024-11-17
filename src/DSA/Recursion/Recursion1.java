package DSA.Recursion;

public class Recursion1 {
    public static void printNumb(int n) {
        if (n == 1) {
            return;
        }
        System.out.println(n);
        printNumb(n - 1);
    }

    public static void printNumberOneTFive(int n) {
        if (n > 5) {
            return;
        }
        System.out.println(n);
        printNumberOneTFive(n + 1);
    }

    public static void main(String[] args) {
        int n = 5;
        printNumb(n);
        int x = 1;
        printNumberOneTFive(x);
    }
}
