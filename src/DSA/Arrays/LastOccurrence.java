package DSA.Arrays;

import java.util.Arrays;
/*
 * in this code we can check last occurrence of the element in the array..
 */
public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr = {5,6,5,3,5,4};
        int value = 5;
        System.out.println(Arrays.toString(arr));
        for(int i = arr.length - 1 ; i > 0; i--){
            if(arr[i]==value){
                System.out.println("The last occurrence of the "+value+" at the index of : "+i);
                break;
            }else{
                System.out.println("Element not found..");
            }
        }
    }
}
