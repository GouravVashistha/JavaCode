package DSA.Arrays;

public class FindPairSumEqualToTarget {
    static int twoPairSum(int[] arr, int target) {
        int ans = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(arr[i] + arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }

    static int tripletsPairSum(int[] arr,int target){
        int ans = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if(arr[i] + arr[j] + arr[k] == target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 6, 3, 5, 8, 2 };
        int target = 7;
        System.out.println(twoPairSum(arr, target));

        int[] arr1 = {1,4,5,6,3};
        target = 12;
        System.out.println(tripletsPairSum(arr1, target));
    }
}
