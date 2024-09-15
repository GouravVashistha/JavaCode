package ExceptionHandle;

public class ExceptionClass {
    public static void valid(int age) throws InvalidAgeEcxeption {
        if (age < 18) {
            throw new InvalidAgeEcxeption("Age is lesser than 18");
        } else {
            System.out.println("Vote");
        }
    }

    public static void main(String[] args) {
        try {
            valid(3);
        } catch (InvalidAgeEcxeption e) {
            System.out.println("Exception occurs");
            System.out.println("You got custom Exception"+e);
        }
    }
}
