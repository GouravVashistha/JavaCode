package DSA.SearchingAlogrithum;
import java.util.Scanner;

public class BinarySearchAlgo {
    public static int binarySearchMethod(int[] a, int beg, int end, int item) {
        int mid;
        if (end >= beg) {
            mid = (beg + end) / 2;
            if (a[mid] == item) {
                return mid + 1;
            } else if (a[mid] < item) {
                return binarySearchMethod(a, mid + 1, end, item);
            } else {
                return binarySearchMethod(a, beg, mid - 1, item);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {16, 19, 20, 23, 45, 56, 78, 90, 96, 100};
        int item, location = -1;
        System.out.println("Enter the element which you want to sercha:-");
        Scanner sc = new Scanner(System.in);
        item = sc.nextInt();
        location = binarySearchMethod(arr,0,9,item);
        if(location != -1)
            System.out.println("the location of the item is "+location);
        else
            System.out.println("Item not found");
    }
}

