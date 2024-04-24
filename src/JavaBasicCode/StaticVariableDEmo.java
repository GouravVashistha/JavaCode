package JavaBasicCode;

public class StaticVariableDEmo {

    int rollno;
    String name;
    static String college = "ITS";

    StaticVariableDEmo(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
        StaticVariableDEmo sc1 = new StaticVariableDEmo(1, "Gaurav");
        StaticVariableDEmo sc2 = new StaticVariableDEmo(2, "Ammar");
        sc1.display();
        sc2.display();

    }
}
