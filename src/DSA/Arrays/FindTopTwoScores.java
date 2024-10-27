package DSA.Arrays;

import java.util.Arrays;

public class FindTopTwoScores {
    public static int[] findTopTwo(int[] array){
        int firstHigest = Integer.MIN_VALUE;
        int secondHigest = Integer.MIN_VALUE;
        for(int score : array){
            if(score >firstHigest){
                secondHigest  =firstHigest;
                firstHigest = score;
            }else if(score> secondHigest && score< firstHigest){
                secondHigest = score;
            }
        }
        return new int[]{firstHigest,secondHigest};
    }


    static int[] lastTwoHigest(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[arr.length-1],arr[arr.length-2]};
        return ans;
    }
    public static void main(String[] args) {
        int[] myArray = {84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0};
        int[] topTwo = FindTopTwoScores.findTopTwo(myArray);
        System.out.println("Array: " + Arrays.toString(myArray));
        System.out.println("First and Second Best Scores: " + Arrays.toString(topTwo));
        // another way
        int [] anss = lastTwoHigest(myArray);
        System.out.println(Arrays.toString(anss));
       
    }
}
