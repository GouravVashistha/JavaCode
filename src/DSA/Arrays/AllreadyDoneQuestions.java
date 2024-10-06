package DSA.Arrays;

import java.util.Arrays;

public class AllreadyDoneQuestions {

    public static int[] middle(int[] array) {
        
        if (array.length <= 2) {
            return new int[0];
        }

        int[] middleArray = new int[array.length - 2];
        int index = 1;
        while (index < array.length - 1) {
            middleArray[index - 1] = array[index];
            index++;
        }
        return middleArray;
    }

    public static void main(String[] args) {
        int[] my_Array = { 1, 2, 3, 4, 5 };
        int[] result = middle(my_Array);
        System.out.println("New array " + Arrays.toString(result));
    }
}
