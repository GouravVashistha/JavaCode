package DSA.Arrays;
public class AddingElementInStart{
  public static void main(String[] args) {
        int[] intArray  = new int[6];
        int length = 0;
        for(int i = 1; i<=4; i++){
            intArray[length] = i;
            length++;
        }
        for(int i = 0;i < intArray.length; i++ ){
            System.out.println("Index " + i + " contains " + intArray[i]);
        }
        System.out.println("---------------------");
        
        for(int i = 4;i>=0 ;i--){
            intArray[i+1] = intArray[i];
        }
        intArray[0] = 20;
        
        for(int i = 0;i < intArray.length; i++ ){
            System.out.println("Index " + i + " contains " + intArray[i]);
        }
    }
}
