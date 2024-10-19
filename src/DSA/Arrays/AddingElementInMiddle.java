package DSA.Arrays;
public class AddingElementInMiddle {
    public static void main(String[] args) {
        int[] intArray = new int[6];
        int length = 0;
        
        // Initialize the array with values 1 to 4
        for (int i = 1; i <= 4; i++) {
            intArray[length] = i;
            length++;
        }
        
        // Print the array before inserting
        System.out.println("Before inserting 50:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }
        
        System.out.println("---------------------");
        
        // Shift elements starting from the end (index 4) to make room for 50
        for (int i = length - 1; i >= 2; i--) {
            intArray[i + 1] = intArray[i];
        }
        
        // Insert 50 at index 2
        intArray[2] = 50;
        length++; // Increment length to reflect the new size
        
        // Print the array after inserting 50
        System.out.println("After inserting 50:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }
    }
}
