package DSA.Arrays;

import java.util.Arrays;

/* 
 * Check if we can Partition the array into two Subarrays with Equal sum. More Formally, check that the Prefix Sum 
 * of a part of the Array is equal to the Suffix sum of rest of the Array.
 * 
 */

public class PartitionOfTheArray {

    // Brute Force Approach
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
        int[] arr = {1, 3, 5, 6, 2, 1};

        System.out.println(equalSumPartition(arr));
    }
}
