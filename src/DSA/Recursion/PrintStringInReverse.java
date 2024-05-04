package DSA.Recursion;

public class PrintStringInReverse {
    public static void printRevrse(String str,int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRevrse(str, idx-1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        printRevrse(str, str.length()-1);
    }
}
