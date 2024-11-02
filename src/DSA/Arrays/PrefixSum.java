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

public class PrefixSum {
    public static void main(String[] args) {

    }
}
