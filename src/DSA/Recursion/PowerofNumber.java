package DSA.Recursion;

public class PowerofNumber {
    public static  int Power(int b,int p){
        int power = 1;
        for(int i = 1;i<=p;i++){
            power = power*b;
        }
        return p;
    }

    public static void main(String[] args) {
        int power = Power(2, 3);
        System.out.println(power);
    }

}
