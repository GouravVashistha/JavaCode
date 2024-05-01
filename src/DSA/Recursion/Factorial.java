package DSA.Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int i, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = sc.nextInt();
        sc.close();
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}

