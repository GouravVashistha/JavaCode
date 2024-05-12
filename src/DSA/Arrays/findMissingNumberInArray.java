package DSA.Arrays;

public class findMissingNumberInArray {
    public static int findMissingNumber(int[] array){
        int n = array.length+1;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,6};
        int missingNumber = findMissingNumber(myArray);
        System.out.println("Missing NUmber is : "+missingNumber);
    }
}
