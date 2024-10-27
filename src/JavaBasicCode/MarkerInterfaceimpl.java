
package JavaBasicCode;
class MarkerInterfaceimpl implements Cloneable {
    private String name;
    private int age;

    public MarkerInterfaceimpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "MarkerInterfaceimpl{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        try {
            MarkerInterfaceimpl MarkerInterfaceimpl1 = new MarkerInterfaceimpl("Alice", 20);
            MarkerInterfaceimpl MarkerInterfaceimpl2 = (MarkerInterfaceimpl) MarkerInterfaceimpl1.clone();

            System.out.println("Original: " + MarkerInterfaceimpl1);
            System.out.println("Cloned: " + MarkerInterfaceimpl2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
