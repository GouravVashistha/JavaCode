package JavaBasicCode;

public class SumOfTheDigitNumber {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;
        int rem = 0;
        while(num !=0){
            rem = num%10;
            num = num/10;
            sum = sum+rem;
        }
        System.out.print(sum);
    }
}
