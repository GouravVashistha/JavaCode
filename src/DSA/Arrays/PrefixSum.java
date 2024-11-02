package DSA.Arrays;
/*
 * Pattern: Prefix Sums
 * Given an interger array 'a',return the prefix sum/running sum in the same array withour creating a new array
 * 
 * Input: [1, 2, 3, 4, 5]
 * Prefix sum array: [1, 3, 6, 10, 15]
 * 
 * pref[0] = a[0];
 * pref[1] = a[0] + a[1];
 * pref[2] = a[0] + a[1] + a[2];
 * pref[3] = a[0] + a[1] + a[2] + a[3];
 * 
 * pref[0] = a[0]
 * pref[1] = pref[0] + a[1];
 * pref[2] = pref[1] + a[2];
 * pref[3] = pref[2] + a[3];
 * 
 * for any i >= 1;
 * pref[i] = pref[i-1] + a[i];
 */

import java.util.Arrays;

public class PrefixSum {
    // with creating new array
    static int[] makePrefixSUm(int[] arr) {
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }
        return pref;
    }

    static int[] makePrefixSUmWithoutNewArray(int[] arr) {
        int n = arr.length;
        for(int i = 1; i < n; i++){
            arr[i] = arr[i]+arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] ans = makePrefixSUm(arr);
        int[] ans2 = makePrefixSUmWithoutNewArray(arr);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans2));

    }
}
