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

        SumInter sumInter = (int a,int b)->{
            return a+b;
        };
        System.out.println("sum of two Number :-"+sumInter.sum(2, 6));


        SumInter sumInterOptimize = (a,b)->a+b;
        System.out.println("sum of two Number :-"+sumInterOptimize.sum(22, 6));

        LengthInter lengthInter = (str -> str.length());
        System.out.println(lengthInter.getlenght("Gaurav Vashistha..!"));


    }
}
