package JavaBasicCode;
/*
 Constructor chaining enables us to call one constructor from another constructor of the class
 with respect to the current class object. We can use this keyword to perform constructor chaining
 within the same class.
 */
class Employee{
    int id,age;
    String name ,address;

    public Employee(int age){
        this.age = age;
    }

    public Employee(int id,int age){
        this(age);
        this.id = id;
    }

    public Employee(int id,int age,String name,String address){
        this(id,age);
        this.name = name;
        this.address = address;
    }
}

public class ConstructorCleaningExample {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, 25, "Gaurav", "Delhi");
        System.out.println("ID :"+emp1.id+" Name:"+emp1.name+" age:"+emp1.age+" address: "+emp1.address);
    }
}
