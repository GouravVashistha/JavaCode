package DSA.Arrays;

import java.util.Arrays;

// Reverse Array
public class ReverseArray {
    public static int[] reverse(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        for(int i = n-1 ; i >= 0; i--){
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static int[] halfReverse(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        int mid = n/2;
        
        for(int i = mid-1; i >= 0; i--){
            ans[j++] = arr[i];
        }
        for(int i = mid; i < n; i++){
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        // System.out.println((Arrays.toString(reverse(arr))));
        System.out.println((Arrays.toString(halfReverse(arr))));
    }
}
