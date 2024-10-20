package DSA.Arrays;

public class ArraySearch {
    public static boolean linearSearch(int[] arr,int length, int element){
        if(arr==null && length==0){
            return false;
        }

        for(int i = 0; i < length; i++){
            if(arr[i]==element){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = new int[6];
        int length = 0;
        for(int i = 0; i < 6 ; i++){
            arr[length] = i;
            length++;
        }

        System.out.println("Does the array contain the element 4 ? - " + ArraySearch.linearSearch(arr, length, 7));
    }
}
