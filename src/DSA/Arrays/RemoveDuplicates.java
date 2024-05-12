package DSA.Arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int[] remove(int[] arr) {
        int n = arr.length;
        int[] uniqueArray = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[index++] = arr[i];
            }
        }
        return Arrays.copyOf(uniqueArray, index);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 5};
        int[] uniqueArray = RemoveDuplicates.remove(arr);
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Array with Duplicates Removed: " + Arrays.toString(uniqueArray));

    }
}
