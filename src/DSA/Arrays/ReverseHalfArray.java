package DSA.Arrays;

import java.util.Arrays;

public class ReverseHalfArray {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6,7,8};
        for (int i=0, j= (myArray.length-1)/2;i<myArray.length/4; i++,j--) {
            int temp = myArray[i];
            myArray[i]=myArray[j];
            myArray[j]=temp;
        }
        for(int i=0; i< myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
