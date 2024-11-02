package DSA.Arrays;

import java.util.Arrays;

/*
 *  sort an array consisting of only os and 1s.
 * arr = 1 0 0 1 0 1 1 0 0
 * ans = 0 0 0 0 0 1 1 1 1
 */
public class SortTheArraysZeroOne {
    static void SortZeroANdOnes(int[] arr) {
        int n = arr.length;
        int count = 0;
        // count number of zeros in array
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }

        // 0 to zeroes -1: 0, zeroes to n-1 :1
        for(int i = 0; i < n ; i++){
            if(i<count){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println("Orignial Arrya : "+Arrays.toString(arr));
        SortZeroANdOnes(arr);
        System.out.println("Sorted Arrays : "+Arrays.toString(arr));
    }
}
