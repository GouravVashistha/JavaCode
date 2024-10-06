package DSA.Arrays;

import java.util.Scanner;

public class FindTheElementIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Input the value to find
        System.out.println("Which value's index do you want to find in the array?");
        int findValue = sc.nextInt();
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (numbers[i] == findValue) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("The value Found at the indx of " + index);
        } else {
            System.out.println("Value is not present in the array.");
        }
        sc.close();
    }
}
