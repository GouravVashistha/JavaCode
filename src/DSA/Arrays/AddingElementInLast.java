package DSA.Arrays;
public class AddingElementInLast{
  public static void main(String[] args) {
        int[] intArray  = new int[6];
        int length = 0;
        for(int i = 0; i<3; i++){
            intArray[length] = i;
            length++;
        }
        for(int i = 0;i < intArray.length; i++ ){
            System.out.println("Index " + i + " contains " + intArray[i]);
        }
        System.out.println("---------------------");
        intArray[length] = 10;
        length++;
        for(int i = 0;i < intArray.length; i++ ){
            System.out.println("Index " + i + " contains " + intArray[i]);
        }
        System.out.println(length);
    }
}
