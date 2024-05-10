package DSA.Arrays;

import java.util.Arrays;

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

    public void insertValueInTheArray(int row,int col,int value){
        try{
           if(arr[row][col] == Integer.MIN_VALUE){
               arr[row][col] =value;
               System.out.println("successfully Inserted");
           }else{
               System.out.println("This cell is already occupied By: "+arr[row][col]);
           }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array!");
        }
    }



    public static void main(String[] args) {
        TwoDimensionalArray tda = new TwoDimensionalArray(3, 3);
        tda.insertValueInTheArray(0, 0, 10);
        tda.insertValueInTheArray(0, 1, 20);
        tda.insertValueInTheArray(0, 2, 20);
        tda.insertValueInTheArray(1, 0, 30);
        tda.insertValueInTheArray(0, 0, 40);
        tda.insertValueInTheArray(1, 1, 50);
        tda.insertValueInTheArray(2, 0, 60);
        tda.insertValueInTheArray(2, 1, 70);
        tda.insertValueInTheArray(2, 2, 80);
        System.out.println(Arrays.deepToString(tda.arr));

    }
}