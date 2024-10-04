package JavaBasicCode;

import java.util.Scanner;

public class SwtichCaseProblem {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter What opertaion you want to Perforn +,-,/,*");
    String opertation = sc.next();
    int a = sc.nextInt();
    int b = sc.nextInt();
    switch (opertation) {
        case "+":
            System.out.println("a + b: "+(a+b));
            break;
        case "-":
            System.out.println("a-b: "+(a-b));
            break;
        case "*":
            System.out.println("a*b: "+(a*b));
            break;
        case "/": 
            System.out.println("a/b: "+(a/b));
            break;   
        default:
            break;
    }
}
    
}