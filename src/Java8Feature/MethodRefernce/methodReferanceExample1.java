package Java8Feature.MethodRefernce;

import java.util.*;

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class methodReferanceExample1{

    public static int compareByName(Person a, Person b){
        return a.getName().compareTo(b.getName());
    }
    public static int compareByAge(Person a, Person b){
        return a.getAge().compareTo(b.getAge());
    }


    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Gaurav", 57));
        personList.add(new Person("Shabbir",55));
        personList.add(new Person("Yash", 5));
        personList.add(new Person("Sidharth",105));
        /*
        Trying to Print the Data using multiple way..
         */
//        personList.forEach(person -> System.out.println(person));

//        personList.forEach(System.out::println);

        Iterator<Person> itr= personList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


        Collections.sort(personList,methodReferanceExample1::compareByName);
        System.out.println("Filter By Name :");
        personList.stream().map(x -> x.getName()).forEach(System.out::println);
        System.out.println("Filter By Age :");
        Collections.sort(personList,methodReferanceExample1::compareByAge);
        personList.stream().map(x->x.getAge()).forEach(System.out::println);

    }

}
