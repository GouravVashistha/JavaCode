package DSA.Arrays;

import java.util.Arrays;

public class DeleteElementFromTheArray {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        int length = 0;
        for (int i = 0; i < 6; i++) {
            intArray[length] = i;
            length++;
        }
        System.out.println("Original array: " + Arrays.toString(intArray));

        length--;
        System.out.println("Array after deleting the last element: " + Arrays.toString(Arrays.copyOf(intArray, length)));
        
        for (int i = 0; i < length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
