package JavaBasicCode;

public class Patterns {
    public static void squarPattern(){
        for(int i = 1;i<=4;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
           System.out.println("");
        }
    }
    public static void squarPattern2(){
        for(int i= 1;i<=4;i++){
            for(int j = 1;j<=5;j++){
                if(i == 1 || j == 1 || i == 4 || j == 5){
                     System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void TrianglePattern1(){
        for(int i = 1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        // squarPattern();
        // squarPattern2();
        TrianglePattern1();

    }
}
