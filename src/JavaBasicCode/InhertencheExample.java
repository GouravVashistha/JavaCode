package JavaBasicCode;
/*
    Inheritance is a mechanism by which one object acquires all the properties and Behaviour
    of another object of another class. It is use for code reusability and Method Overriding

    There is 5 type of Inheritance In java:
        1. SIngle level
        2. Multi level
        3. Hybrid Inheritance
        4. Hierarchical Inheritance

    java Dose not support Multiple inheritance...
    Runtime polymorphism cannot be achieved without using inheritance.
    Method overriding cannot be achieved without inheritance. By method overriding, we can give a specific implementation of
    some basic method contained by the base class.
 */
class Animal{

    void Sound(){
        System.out.println("Animal Make Sound...!");
    }
}
class Dog extends Animal{
    @Override
    void Sound() {
        System.out.println("Dog Barks...");
    }

}
public class InhertencheExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.Sound();
        dog.Sound();
    }

}
