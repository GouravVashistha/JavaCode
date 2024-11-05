package DSA.Arrays;

import java.util.Arrays;

/* 
 * Check if we can Partition the array into two Subarrays with Equal sum. More Formally, check that the Prefix Sum 
 * of a part of the Array is equal to the Suffix sum of rest of the Array.
 * 
 */

public class PartitionOfTheArray {

    static boolean canPartition(int[] arr, int n) {
        // Step 1: Calculate the total sum of the array
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // Step 2: If sum is odd, it's impossible to partition it into two equal sum
        // subsets
        if (sum % 2 != 0) {
            return false;
        }

        // Step 3: We want to find if there is a subset with sum equal to sum/2
        sum = sum / 2;

        // Step 4: DP to check if we can form sum/2 with the given elements
        boolean[][] dp = new boolean[n + 1][sum + 1];

        // Step 5: If sum is 0, the answer is true (empty subset gives sum 0)
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // Step 6: Fill the dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                // If the current element is greater than the current sum, we can't include it
                if (arr[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    // Otherwise, we check if we can either include or exclude the current element
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                }
            }
        }

        // The answer is in dp[n][sum] (whether we can form the sum `sum` using all
        // elements)
        return dp[n][sum];
    }

    static int findArraySum(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }

    public static boolean equalSumPartition(int[] arr) {
        int totalSum = findArraySum(arr);
        int PreSum = 0;
        for (int i = 0; i < arr.length; i++) {
            PreSum += arr[i];
            int SuffixSum = totalSum - PreSum;
            if (PreSum == SuffixSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 2, 1 };

        System.out.println(equalSumPartition(arr)); // Expected output: true
    }
}
