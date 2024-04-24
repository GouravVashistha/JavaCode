package JavaBasicCode;
/*
    Inheritance is a machanism by which one object acquires all the properties and Behaviou
    of another object of another class. It is use for code reusebility and Method Overriding

    There is 5 type of Inheritance In java:
        1. SIngle level
        2. Multi level
        3. Huybrid Inheritance
        4. Hierarchical Inheritance

    java Dose not suport Multiple inhertance...
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
