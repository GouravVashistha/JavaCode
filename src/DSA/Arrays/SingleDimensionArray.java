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
        time Complexit:- O(N)

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




    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(10);
        // Inseration in Array
        sda.insert(0, 5);
        sda.insert(1, 10);
        sda.insert(2, 20);
        sda.insert(1, 30);
        sda.insert(12, 120);
        sda.traverseArray();
        sda.printArray();
//        var firtELement  = sda.arr[1];
//        System.out.println("First Element in Array is: "+firtELement);
    }

}
