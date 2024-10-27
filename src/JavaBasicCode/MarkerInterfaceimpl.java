class Student implements Cloneable {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        try {
            Student student1 = new Student("Alice", 20);
            Student student2 = (Student) student1.clone();

            System.out.println("Original: " + student1);
            System.out.println("Cloned: " + student2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
