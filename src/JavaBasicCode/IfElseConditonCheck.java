package JavaBasicCode;

import java.util.Scanner;


public class IfElseConditonCheck {
    public static void checkOdd(int n){
    if(n%2==0){
        System.out.println("Even");
    }else{
        System.out.println("Odd");
    }
    }

    public static void Vote(int age){
        if(age>18){
            System.out.println("You are eligible for given vote..");
        }else{
            System.out.println("you are not adult..");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Vote(n);
        checkOdd(n);

        sc.close();
    }
}
