package DSA.Arrays;

import java.util.Arrays;

public class DeletingElementFromStart {
    public static void main(String[] args) {
        int[] newArray = new int[8];
        int length = 0;
        for(int i = 0; i<6;i++){
            newArray[length] = i;
            length++;
        }
        System.out.println("Original Array : "+Arrays.toString(newArray));
         
        // Delete Element fromt the start 

        for(int i = 1;i<newArray.length;i++){
            newArray[i-1] = newArray[i];
            length--;
        }
        System.out.println("After Delete element Array : "+Arrays.toString(newArray));


    }
}
