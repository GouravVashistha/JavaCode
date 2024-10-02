package JavaBasicCode;

import java.util.Scanner;

public class JavaBasicStart {

    public static void takeInput() {
        System.out.println("In this Method we can check \n how to take Input form the user..!!");
    }
    

    protected static void sumofNumber(int a, int b) {
        // (* / %) > (+ -)

        int sum = a + b;
        System.out.println(sum);
        int ans = a * b / a - b;
        int ans2 = (a * b) / (a - b);
        System.out.println(ans);
        System.out.println(ans2);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("a :");
        int a = sc.nextInt();
        System.out.print("b :");
        int b = sc.nextInt();
        sumofNumber(a, b);


    }
}
