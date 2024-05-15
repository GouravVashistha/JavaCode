package DSA.Arrays;

import java.util.Scanner;

public class RotateMatrix {

//    public boolean rotateMatrix(int[][] matrix){
//        if(matrix.length==0 || matrix.length != matrix[0].length){
//            return false;
//        }
//        int n = matrix.length;
//        for(int layer = 0; layer<n/2;layer++){
//            int first = layer;
//            int last = n -1-layer;
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row Size: ");
        int row = sc.nextInt();
        System.out.println("Enter the Column Size: ");
        int column = sc.nextInt();
        int [][] arr = new int[row][column];
        for(int i = 0; i< arr.length; i++){
            for (int j= 0; j< arr[i].length; j++){
                System.out.println("Enter the Values in Array: ");
                arr [i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("Original Array :");
        for(int i = 0; i< arr.length; i++){
            for (int j= 0; j< arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("Transposed Array :");
        for(int i = 0; i< arr.length; i++){
            for (int j= 0; j< arr[i].length; j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println("");
        }

    }
}
