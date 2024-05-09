package DSA.Arrays;

public class SingleDimensionArray {
    int arr[] = null;

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =Integer.MIN_VALUE;
        }
    }
    /*
        Insert ELemetn in the Array.
        Time Complexity of inseration is :O(1);
     */
    public void insert(int location, int valueToBeInsert) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInsert;
                System.out.println("successfully Inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }

    }
    /*
        Array Traversal:-
        In this we put if condition because if we haven't declared our array but we put it over
        here,it might give an error.so to prevent such cases, to show a clear message
        we can put exception over here.
        output of  given program
        5 10 20 -2147483648 -2147483648 -2147483648 -2147483648 -2147483648 -2147483648 -2147483648
        In output  3 value is there  other space showing min value of Integer becuse
        this mesns that our cell over here are empty ,so we can isert any element to these cell
        over here.
        time Complexity- O(N)

     */
    public void traverseArray(){
        try{
            for(int i= 0;i<arr.length;i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }catch (Exception e){
            System.out.println("Array no longer exists! ");
        }
    }
    public void printArray() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != Integer.MIN_VALUE) {
                System.out.println("Index " + i + ": " + arr[i]);
            }
        }
    }

    // Searching for an element in the given Array
    // Time Complexity : O(N);
    // Space Complexity : O(1);
    public void searchInArray(int valueToSearch){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==valueToSearch){
                System.out.println("value is found at the index of "+ i);
                return;
            }
        }
        System.out.println("value is not present in the arrays");
    }
    /*
    Deleting Array Element
    practically we can not delete any value from the array.
    Because in Java, any value of cell can not be blank
    There has to be a value in it. By default compiler inserts zero value to cell
    when we are creating an integer array but you can alwasy give a default value to the cell
    which number you want.
     */



    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(10);
        // Inseration in Array
        sda.insert(0, 5);
        sda.insert(1, 10);
        sda.insert(2, 20);
        sda.insert(1, 30);
        sda.insert(12, 120);
//        sda.traverseArray();
//        sda.printArray();
        sda.searchInArray(10);
//        var firtELement  = sda.arr[1];
//        System.out.println("First Element in Array is: "+firtELement);
    }

}
