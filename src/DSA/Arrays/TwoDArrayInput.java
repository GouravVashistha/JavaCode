package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter number of Columns: ");
        int col = sc.nextInt();

        int[][] numbers = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(numbers[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(numbers));

    }
}
