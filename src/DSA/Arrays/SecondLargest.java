package DSA.Arrays;

import java.util.Arrays;

// Q -  Second larget  element in the given array.
public class SecondLargest {
    // step 1
    static int findMx(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;

    }
    //step 2
    static int findSecondMx(int[] arr){
        int mx = findMx(arr);
        int n = arr.length;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] ==mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        System.out.println(Arrays.toString(arr));
        int second = findMx(arr);
        return second;
    }

    // Another way
    static int findSecondLargest(int[] arr) {
        int second = Integer.MIN_VALUE;
        int first = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
        }

        return second;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 11, 5, 12, 7, 5, 6, 9 };
        // System.out.println(findSecondLargest(arr));

        System.out.println(findSecondMx(arr));
        // Another way

        // Arrays.sort(arr);
        // int index=arr.length;
        // System.out.println(arr[index-2]);
    }
}
