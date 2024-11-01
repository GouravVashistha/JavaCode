package DSA.Arrays;

import java.util.Arrays;

/*
 * Rotate the given array 'a' by k steps, where k is non-negative. with or without extra space;
 * Note: k can be greater than n as well.
 * 
 * arr = 1,2,3,4,5
 * {k=1} 5,1,2,3,4
 * {k=2} 4,5,1,2,3
 * {K=3} 3,4,5,1,2
 * 
 */
public class RotateTheArray {
    // with Extra Space
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

    // without Extra space 
    static void swapInArray(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverseArrayUsingSwapping(int[] arr,int i,int j){
        while(i<j){
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }
    public static int[] rotateArraywithout(int[] arr ,int k){
        int n  = arr.length; //n = 9
        k = k % n;          // k = 3
        reverseArrayUsingSwapping(arr, 0 ,n-k-1); // 0 to (8-4-1)=4-> 5,4,3,2,1,6,7,8
        reverseArrayUsingSwapping(arr, n-k ,n-1);   //(8-5)=5 to (8-1)->5,4,3,2,1,8,7,6
        reverseArrayUsingSwapping(arr, 0 ,n-1);   // 0 TO 7 -> 6,8,7,1,2,3,4,5  
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        // System.out.println("Original Array: "+ Arrays.toString(arr));
        System.out.println("Rotate Array  : "+ Arrays.toString(rotateArray(arr, 4)));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // System.out.println("Original Array: "+ Arrays.toString(arr));
        // System.out.println("Rotate Array  : "+ Arrays.toString(rotateArraywithout(arr,4)));
    }
}
