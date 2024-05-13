package DSA.Arrays;

import java.util.Arrays;

public class FindingANumberInArray {
    public int  searchInArray(int[] intArray, int valueToSearch) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == valueToSearch) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6,7};
        int valueToBeSearch = 6;
        FindingANumberInArray f = new FindingANumberInArray();
        int result = f.searchInArray(intArray, valueToBeSearch);
        System.out.println("Index of value " + valueToBeSearch + " at this index of " + result);
    }
}
