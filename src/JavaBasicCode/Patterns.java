package JavaBasicCode;

public class Patterns {
    public static void squarPattern() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void squarPattern2() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || i == 4 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void TrianglePattern1() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static void TrianglePattern2() {
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void TrianglePattern3() {
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void TrianglePattern4() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }

    public static void TrianglePattern5(){
        for(int i=1; i<=5;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void  TrianglePattern6(){
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=5-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void FloydsTriangle(){

    }

        public static void main(String[] args) {
            FloydsTriangle();

    }
}
