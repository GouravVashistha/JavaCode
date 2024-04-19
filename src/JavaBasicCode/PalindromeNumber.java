package JavaBasicCode;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int originalNumber = num;
        int rev = 0;
        while(num !=0){
            rev = rev*10 +num%10;
            num = num/10;
        }
        System.out.println(rev);

        if(rev==originalNumber){
            System.out.println("Number is Palindrome Number...!");
        }else{
            System.out.println("Number is Not Palindrome Number");
        }
    }
}
