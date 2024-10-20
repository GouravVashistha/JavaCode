package DSA.Arrays;

import java.util.Arrays;

public class DeleteAnywhereFromTheArray {
    public static void main(String[] args) {
        int[] newArray = new int[7];
        int length = 0;
        for(int i = 0 ; i<  6 ; i++){
            newArray[length] = i;
            length++;
        }
        System.out.println("Origninal Array :"+Arrays.toString(newArray));

        for(int i= 3;i<newArray.length;i++){
            newArray[i-1] = newArray[i];
            length--;
        }
        System.out.println("Delete element from the  Array :"+Arrays.toString(newArray));


    }
}
