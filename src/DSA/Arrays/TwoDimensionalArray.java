package DSA.Arrays;

public class TwoDimensionalArray {
    int arr[][] = null;
    // Constructor
    public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
        this.arr = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < arr.length; row++) {
            for(int col = 0; col< arr[0].length; col++){
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    public static void main(String[] args) {

    }
}