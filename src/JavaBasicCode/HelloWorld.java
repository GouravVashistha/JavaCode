package JavaBasicCode;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter Name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
    }
}
