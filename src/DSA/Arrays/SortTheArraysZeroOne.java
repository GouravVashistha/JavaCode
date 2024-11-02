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
        for (int i = 0; i < n; i++) {
            if (i < count) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    // Another approach  more optimized 
    static void SortZeroANdOnesAnother(int[] arr){
        int nextZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[nextZero];
                arr[nextZero] = arr[i];
                arr[i] = temp;
                nextZero++;
            }
        }
    }

    static void SortZeroAndOneSecondApproach(int[] arr){
        int low = 0, high = arr.length - 1;
        while (low < high) {
            if (arr[low] == 1 && arr[high] == 0) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
            if (arr[low] == 0) {
                low++;
            }
            if (arr[high] == 1) {
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        // System.out.println("Orignial Arrya : " + Arrays.toString(arr));
        // SortZeroANdOnes(arr);
        // System.out.println("Sorted Arrays : " + Arrays.toString(arr));

        System.out.println("Orignial Arrya : " + Arrays.toString(arr));
        SortZeroAndOneSecondApproach(arr);
        System.out.println("Sorted Arrays : " + Arrays.toString(arr));
    }
}
