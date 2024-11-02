package DSA.Arrays;

import java.util.Arrays;

/*
 * Given an array of Interger 'a', move all the even interger at the beiginning of the array followed by the odd integers.
 * The relative order of odd and even intgers does not matter. return any array that satisfies this condition.
 * 
 * Input: [1, 2, 3, 4, 5, 6, 7, 8]
 * Output: [2, 4, 6, 8, 1, 3, 5, 7] 
 * 
 */
public class MoveAllEvenIntegers {
    /**
     * Move all the even interger at the beiginning of the array followed by the odd
     * integers.
     * Input: [1, 2, 3, 4, 5, 6, 7, 8]
     * Output: [2, 4, 6, 8, 1, 3, 5, 7]
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static int[] moveAllEvenIntegers(int[] arr) {
        int[] ans = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                ans[j++] = arr[i];
                ans[j] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                ans[j++] = arr[i];
            }
        }
        return ans;
    }

    static void sortArrayByParity(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

            }
            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 == 1) {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] ans = moveAllEvenIntegers(arr);
        // System.out.println(Arrays.toString(ans));
        sortArrayByParity(arr);
        System.out.println(Arrays.toString(arr));

    }
}
