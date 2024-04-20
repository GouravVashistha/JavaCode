package JavaBasicCode;

public class SumOfTheNumber {
    public static void main(String[] args) {
        int number = 1234;
        int sum = 0;
        int rem = 0;
        while(number>0){
            rem = number%10;
            sum = sum+rem;
            number = number/10;
        }
        System.out.println(sum);
    }
}
