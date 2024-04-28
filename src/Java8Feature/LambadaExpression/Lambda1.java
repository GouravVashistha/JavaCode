package Java8Feature.LambadaExpression;

public abstract class Lambda1 implements MyInter{
    public static void main(String[] args) {
        System.out.println("MY system start..!");
//      for running  blow code amke class abstract
//        MyInter i = new MyInter() {
//            @Override
//            public void sayHello() {
//                System.out.println("Hello gaurav this side..");
//            }
//        };
//        i.sayHello();

        // using our interface with the help of lambda

        MyInter i = ()->{
            System.out.println("this is first lambda program");
        };
        i.sayHello();

    }
}
