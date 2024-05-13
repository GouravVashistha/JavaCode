package DSA.Arrays;

public class MaxProductOfTwoInteger {
    public static String maxProduct(int[] intArray) {
        int max = 0;
        String pairs = "";
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] * intArray[j] > max) {
                    max = intArray[i] * intArray[j];
                    pairs = Integer.toString(intArray[i]) + "," + Integer.toString(intArray[j]);
                }
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        int[] intArray = {50, 10, 30, 20, 40};
        System.out.println(maxProduct(intArray));
    }
}
