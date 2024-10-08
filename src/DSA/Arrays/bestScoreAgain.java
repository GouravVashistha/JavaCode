package DSA.Arrays;

import java.util.Arrays;

public class bestScoreAgain {
    public static int[] BestScore(int[] array){
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for(int score :array){
            if(score>firstHighest){
                secondHighest = firstHighest;
                firstHighest = score;
            }else if(score>secondHighest && score<firstHighest){
                secondHighest = score;
            }
        }
        return new int[]{firstHighest,secondHighest};
    }

   public static void main(String[] args) {
    int[] myArray = {84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0};
    int[] topTwo = bestScoreAgain.BestScore(myArray);
    System.out.println(Arrays.toString(topTwo));
   }
}
