package DSA.Recursion;

import java.util.Scanner;

public class FactorialRecursion {

    public int factorial(int n){
        if(n<1){
            return -1;
        }
        if(n==0 || n==1){
            return 1;
        }
        return  n*factorial(n-1);
    }

    public static int calcFactorial(int n){
        if(n==0 || n==1){
            return 1;
        }

        int fact_nm1 = calcFactorial(n-1);
        int fact_n = n*fact_nm1;
        return fact_n;
    }



    public static void main(String[] args) {
        FactorialRecursion f = new FactorialRecursion();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int facto = f.factorial(num);
        System.out.println(facto);

        calcFactorial(num);
    }
}
