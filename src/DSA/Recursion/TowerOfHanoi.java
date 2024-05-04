package DSA.Recursion;

// 1. only one disk transferred in 1 step
// 2. small disks are always keeps  on Top  of large disks.

public class TowerOfHanoi {
    public static void tower(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("transfer dist "+ n +" from "+ src+ " to "+ dest);
            return;
        }
        tower(n-1, src, dest, helper);
        System.out.println("transfer dist "+ n +" from "+ src+ " to "+ dest);
        tower(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 3;
        tower(n, "S", "H", "D");
    }
}
