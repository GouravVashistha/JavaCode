package DSA.Arrays;

public class AddTwoMatrices {

    static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Addition not possible");
            return;
        }
        int[][] sum = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        // print sum arr
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] arr2 = { { 7, 8, 9 }, { 10, 11, 12 } };

        add(arr1, 2, 3, arr2, 2, 3);

    }
}
