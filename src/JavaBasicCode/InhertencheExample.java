package JavaBasicCode;

class Animal{
    void Sound(){
        System.out.println("Animal Make Sound...!");
    }
}
class Dog extends Animal{
    @Override
    void Sound() {
        super.Sound();
    }
}
public class InhertencheExample {

}
