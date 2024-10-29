package DSA.Arrays;

import java.util.Arrays;

/*
 * Rotate the given array 'a' by k steps, where k is non-negative.
 * Note: k can be greater than n as well.
 * 
 * arr = 1,2,3,4,5
 * {k=1} 5,1,2,3,4
 * {k=2} 4,5,1,2,3
 * {K=3} 3,4,5,1,2
 * 
 */
public class RotateTheArray {

    public static int[] rotateArray(int[] arr ,int k){
        int n = arr.length;
        k = k % n;
        int j = 0;
        int[] ans = new int[n];
        
        for(int i = n-k ; i < n ; i++){
            ans[j++] = arr[i];
        }
        for(int i = 0; i < n-k; i++){
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Original Array: "+ Arrays.toString(arr));
        System.out.println("Rotate Array  : "+ Arrays.toString(rotateArray(arr, 51)));
    }
}
