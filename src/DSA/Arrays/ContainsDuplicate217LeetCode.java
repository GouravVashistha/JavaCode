package DSA.Arrays;

public class ContainsDuplicate217LeetCode {
    public  boolean isUnique(int[] intArray){
        boolean value = true;
        for(int i = 0;i<intArray.length;i++){
            for(int j = i+1;j< intArray.length;j++){
                if(intArray[i]==intArray[j]){
                    value = false;
                    break;
                }
            }
        }
        return  value;
    }
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6,6};
        ContainsDuplicate217LeetCode contain = new ContainsDuplicate217LeetCode();
        System.out.println(contain.isUnique(intArray));
    }
}
