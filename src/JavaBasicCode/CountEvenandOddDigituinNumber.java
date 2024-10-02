package JavaBasicCode;

import java.util.Scanner;

public class CountEvenandOddDigituinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = sc.nextInt();
        int even = 0;
        int odd = 0;
        int rem = 0;
         while(num>0){
             rem = num % 10;
             if(rem%2==0){
                 even++;
             }else {
                 odd++;
             }
             num = num/10;

         }
        System.out.println("odd :-  "+odd+" ::: " +"even:-  "+ even);
    }
}
