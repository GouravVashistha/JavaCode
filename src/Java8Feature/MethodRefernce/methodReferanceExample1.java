package Java8Feature.MethodRefernce;

import java.util.ArrayList;
import java.util.List;

class Person{
    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public Integer getAge(){
        return age;
    }
    public  String getName(){
        return name;
    }

}
public class methodReferanceExample1 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Gaurav", 24));
        personList.add(new Person("Shabbir",55));
        personList.add(new Person("Yash", 5));
        personList.add(new Person("Sidharth",105));
        System.out.println(personList);

    }

}
