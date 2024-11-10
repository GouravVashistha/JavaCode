package DSA.Arrays;

public class complexity {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        int sum1 = (n * (n + 1));
        System.out.println(sum1);

        System.out.println(sum);

    }
}
