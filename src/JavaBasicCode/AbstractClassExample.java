package JavaBasicCode;

abstract class Sunstar{
    abstract  void printInfo();
}
class Employee1 extends Sunstar{

    void printInfo() {
        String name = "Gaurav Vashistha";
        int age = 25;
        float salary = 30320.25F;
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);

    }
}
public class AbstractClassExample {
    public static void main(String[] args) {
        Sunstar emp1 = new Employee1();
        emp1.printInfo();
    }
}
