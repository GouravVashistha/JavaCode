package JavaBasicCode;

import java.util.Scanner;

public class ReverseString {

    public static void usingAlgorithum(String value) {
        char[] newValue = value.toCharArray();
        String revString = "";
        for (int i = newValue.length - 1; i >= 0; i--) {
            revString += newValue[i];

        }
        System.out.println("using Alogrithum :-"+revString);
    }

    public static void usingStringBuffer(String value) {
        StringBuffer sb = new StringBuffer(value);
        System.out.println("using stringBuffer :-" + sb.reverse());
    }

    public static void usingStringBuilder(String value) {
        StringBuilder sb1 = new StringBuilder(value);
        System.out.println("using StringBuilder :-" + sb1.reverse());
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :-");
        String value = sc.nextLine(); // Use nextLine() to read the entire line
        usingAlgorithum(value);
        usingStringBuffer(value);
        usingStringBuilder(value);
    }
}
