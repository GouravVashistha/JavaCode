package DSA.Arrays;

import java.util.Arrays;

public class TwoSumIndex {
    public static int[] twoSum(int[] nums,int target){
        for(int i = 0; i< nums.length;i++){
            for(int j = i+1 ;j< nums.length ;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }

    

    public static void main(String[] args) {
        int[] num1 = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(num1, target);
        System.out.println(Arrays.toString(result));

        int[] num2 = {3,2,4};
        int target2 = 6;
        int[] result1 = twoSum(num2, target2);
        System.out.println(Arrays.toString(result1));

        int[] num3 = {3,3};
        int target3 = 6;
        int[] result2 = twoSum(num3, target3);
        System.out.println(Arrays.toString(result2));

        int[] num4 = {1,5,3,7};
        int target4 = 8;
        int[] result3 = twoSum(num4, target4);
        System.out.println(Arrays.toString(result3));

        int[] num5 = {10,20,30,40};
        int target5 = 50;
        int[] result4 = twoSum(num5, target5);
        System.out.println(Arrays.toString(result4));

        int[] num6 = {1,2,3,4,5};
        int target6 = 9;
        int[] result5 = twoSum(num6, target6);
        System.out.println(Arrays.toString(result5));

        int[] num7 = {0,0,0,0};
        int target7 = 0;
        int[] result6 = twoSum(num7, target7);
        System.out.println(Arrays.toString(result6));

        int[] num8 = {-1,-2,-3,-4};
        int target8 = -5;
        int[] result7 = twoSum(num8, target8);
        System.out.println(Arrays.toString(result7));
    }
}
