package LeetCode150;

import java.util.Arrays;

public class MergeSortedArray88 {
    // brute force approach
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    // Optimized Approach
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[nums1.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (k < temp.length) {
            if (i >= m) {
                temp[k] = nums2[j];
                j++;
                k++;
                continue;
            }
            if (j >= n) {
                temp[k] = nums1[i];
                i++;
                k++;
                continue;
            }
            if (nums1[i] <= nums2[j]) {
                temp[k] = nums1[i];
                i++;
            } else if (nums1[i] > nums2[j]) {
                temp[k] = nums2[j];
                j++;
            }
            k++;
        }
        for (int l = 0; l < nums1.length; l++) {
            nums1[l] = temp[l];
        }
    }

    public static void main(String[] args) {
        MergeSortedArray88 merger = new MergeSortedArray88();

        int[] nums1 = { 1, 2, 3, 0, 0, 0 }; // The array with extra space for merging
        int m = 3; // Number of initialized elements in nums1
        int[] nums2 = { 2, 5, 6 }; // The second sorted array
        int n = nums2.length; // Number of initialized elements in nums2

        // Perform the merge
        // merger.merge(nums1, m, nums2, n);

        // Output the merged array
        // System.out.println("Merged array: " + Arrays.toString(nums1));

        merge1(nums1, m, nums2, n);
        System.out.println("Merged array: " + Arrays.toString(nums1));

    }
}
