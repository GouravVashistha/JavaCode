package JavaBasicCode;

import java.util.Scanner;

public class ReverseNumber {

    public static void usingAlgo(int num) {
        int rev = 0;
        while (num != 0) {
            rev = (rev * 10) + (num % 10);
            num = num / 10;
        }
        System.out.println("Reverse Number is " + rev);
    }

    public static void usingStringBufferClass(int num) {
    StringBuffer rev;
    StringBuffer sb  =  new StringBuffer(String.valueOf(num));
    rev = sb.reverse();
    System.out.println("Reverse Number using String Buffer class " + rev);

    }

    public static void usingStringBuilder(int num){
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        System.out.println("Reverse the number using string builder :"+sb.reverse());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :-");
        int num = sc.nextInt();
        // using ALgorithum
         usingAlgo(num);
        // using StringBuffer class
        usingStringBufferClass(num);
        // using stringBuilder class
        usingStringBuilder(num);
    }
}

