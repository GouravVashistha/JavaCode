package DSA.Recursion;

public class SumOfNaturalNumber {
    public static void NaturalNumber(int i,int n ,int sum){
        if(i == n){
            sum +=i;
            System.out.println(sum);
            return;
        }
        sum += i;
        NaturalNumber(i+1,n,sum);

    }
    public static void main(String[] args) {

    NaturalNumber(1, 5, 0);
    }
}
