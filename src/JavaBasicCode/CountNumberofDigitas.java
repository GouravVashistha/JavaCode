package JavaBasicCode;

import java.util.Scanner;

public class CountNumberofDigitas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int count = 0;
        while(num != 0){
            num = num / 10;
            count++;
        }
        System.out.println(count);

//        second way

//        int len = (int) Math.log10(num);
//        System.out.println(len+1);
    }

}
