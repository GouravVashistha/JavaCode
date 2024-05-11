package DSA.Arrays;

import java.util.Arrays;

public class MiddleFunction {
    public static int[] middle(int[] array){
        if(array.length<=2){
            return new int[0]; // Return an empty array if the input array has 2 or fewer elements
        }
        // This line creates a new integer array named middleArray with a length equal to the input array length minus 2.
        int[] middleArray = new int[array.length-2];
        int index = 1;
        // Copy the elements from the input array, excluding the first and last elements
        while(index < array.length-1){
            middleArray[index-1] = array[index];
            index++;
        }
        return middleArray;
    }
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        int[] result = middle(myArray);
        System.out.println("Original Array: " + Arrays.toString(myArray));
        System.out.println("Middle Array: " + Arrays.toString(result));
    }
}
