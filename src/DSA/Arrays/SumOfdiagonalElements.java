package DSA.Arrays;

public class SumOfdiagonalElements {

    public static int sumDiagonal(int[][] array) {
        int sum = 0;
        int numRows = array.length; // This line gets the number of rows in the input 2D array and stores it in the numRows variable.

        for(int i = 0;i<numRows;i++){
            sum+=array[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] myArray2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = SumOfdiagonalElements.sumDiagonal(myArray2D);
        System.out.println("Sum of diagonal elements: " + sum);
    }

}
