package Java8Feature.LambadaExpression;

public abstract class Lambda1 implements MyInter{
    public static void main(String[] args) {
        System.out.println("MY system start..!");

        MyInter i = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("Hello gaurav this side..");
            }
        };
        i.sayHello();
    }
}
