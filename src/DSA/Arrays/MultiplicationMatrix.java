package DSA.Arrays;

public class MultiplicationMatrix {

    public static void multiple(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {

        if (c1 != c2) {
            System.out.println(" Wrong dimension... ");
            return;
        }

        int[][] mul = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][k] += (a[i][j] * b[i][j]);
                }
            }
        }

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = {
                { 1, 2 },
                { 3, 4 }
        };
        int[][] b = {
                { 5, 6 },
                { 7, 8 }
        };

        int r1 = 2, c1 = 2, r2 = 2, c2 = 2;
        multiple(a, r1, c1, b, r2, c2);
    }
}
