package JavaBasicCode;

public class LargestOfThreeNumberr {
    public static void main(String[] args) {
        int a = 10, b = 3, c = 2;
        int ms = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(ms);


    }
}
