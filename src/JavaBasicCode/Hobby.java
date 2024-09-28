package JavaBasicCode;

import java.util.*;

class Person {
    String name;
    int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", " + age;
    }
}

public class Hobby {


    public static void addPersonToHobby(Map<String, List<Person>> hobbyMap, String hobby, Person person) {

        hobbyMap.computeIfAbsent(hobby, n -> new ArrayList<>()).add(person);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter hobby:");
        String hobby = scanner.nextLine();

        System.out.println("Enter person name:");
        String name = scanner.nextLine();

        System.out.println("Enter person age:");
        int age = scanner.nextInt();


        Map<String, List<Person>> hobbyMap = new HashMap<>();


        addPersonToHobby(hobbyMap, hobby, new Person(name, age));


        System.out.println("\nHobby Map:");
        hobbyMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
