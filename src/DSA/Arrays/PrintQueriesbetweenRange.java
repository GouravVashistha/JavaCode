package DSA.Arrays;

import java.util.Arrays;

/*
 * Given an array of intdgers of size n . Answer q queries where you need to print the sum of valies in a given range
 * of indices from 1 to r (both inculded)
 * Note: The value of 1 and r in queries follow 1-based indexing.
 * 
 */
public class PrintQueriesbetweenRange {
    // Brute Force Approach
    public static int sumofQueries(int[] arr, int l, int r) {
        int sum = 0;
        for (int i = l - 1; i <= r - 1; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 6 };
        int ans = sumofQueries(arr, 2, 5);
        System.out.println(ans);
    }
}
