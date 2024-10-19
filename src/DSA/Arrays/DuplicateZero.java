package DSA.Arrays;
public class DuplicateZero {

    public void duplicateZeros(int[] arr) {
        int len = arr.length;
        int zeroCount = 0;
        
        // Count the zeros in the original array
        for (int i = 0; i < len; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            }
        }

        // Traverse the array from the end to handle shifting
        int i = len - 1;
        int j = len + zeroCount - 1;

        // Traverse from the back of the array and duplicate zeros
        while (i >= 0) {
            if (arr[i] == 0) {
                if (j < len) arr[j] = 0;  // Duplicate zero
                j--;
            }
            if (j < len) arr[j] = arr[i];  // Shift the element
            i--;
            j--;
        }
    }
}
