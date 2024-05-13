package DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums){

        int n = nums.length;
        if(n==0){
            return 0;
        }
        int index = 0;
        for(int i = 0;i<n;i++){
            if(nums[i] != nums[index]){
                index++;
                nums[i] = nums[index];
            }
        }
        return index +1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2};
        int newLength = removeDuplicates(nums);
        System.out.println("New Length: " + newLength);
        System.out.println("Modified Array: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
}
