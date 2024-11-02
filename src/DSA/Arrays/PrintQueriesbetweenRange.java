package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

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

    public static int[] sumofQueriesPrefixSum(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 2, 4, 1, 3, 6 };
        // int ans = sumofQueries(arr, 2, 5);
        // System.out.println(ans);
        int[] prefsum = sumofQueriesPrefixSum(arr);
        System.out.println("Enter number of queries : ");
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter Range : ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = prefsum[r] - prefsum[l - 1];
            System.out.println("sum " + ans);
        }
    }
}
