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
    public void checkgreaterOrLess(int a,int b){
        if(a==b){
            System.out.println("equal");
        }else if(a>b){
            System.out.println("a is greater");

        }else{
            System.out.println("b is greater");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Vote(n);
        // checkOdd(a);
        IfElseConditonCheck check = new IfElseConditonCheck();
        check.checkgreaterOrLess(a,b);
        sc.close();
    }
}
