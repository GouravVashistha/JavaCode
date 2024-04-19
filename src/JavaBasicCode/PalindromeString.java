package JavaBasicCode;

import java.util.Scanner;

public class PalindromeString {
    public static void palindrome(String str) {
        char[] chars = str.toCharArray();
        String rev = "";
        String originalString = str;
        for (int i = chars.length - 1; i >= 0; i--) {
            rev += chars[i];
        }
        if (rev.equals(originalString)) {
            System.out.println("palindrom");
        } else {
            System.out.println("Not");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :-");
        String str = sc.nextLine();
        palindrome(str);


    }
}
