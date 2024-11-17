package DSA.Recursion;

import java.util.Scanner;

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

    public static void withRecursion(int a,int b,int n){
        if(n == 0){
            return;
        }
        int c = a+b;
        System.out.print(" "+c);  
        withRecursion(b, c, n-1);
    }

    public static int anotherWithRecursion(int count){
        if(count<0){
            return -1;
        }
        if(count==0||count==1){
            return count;
        }
    return anotherWithRecursion(count-1)+anotherWithRecursion(count-2);
    }
    public static void main(String[] args) {
        int count  = 10;
        withOutRecursion(count);
        System.out.println(" ");
        int a = 0,b=1;
        System.out.print(a+" ");
        System.out.print(b);
        int n= 7;
        withRecursion(a,b,n-2);
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int fb = sc.nextInt();

        System.out.println(anotherWithRecursion(fb));

    }
}
