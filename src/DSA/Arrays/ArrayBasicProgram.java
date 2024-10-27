package DSA.Arrays;

import java.util.Scanner;

public class ArrayBasicProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int number[] = new int[size];
        // store the data inside the arreay
        for(int i = 0;i<size;i++){
            number[i]=sc.nextInt();
        }
        // Itreating the element in side the array
        for(int i = 0;i<size;i++){
            System.out.println(number[i]);
        }
        sc.close();
    }
}
