package Java8Feature.LambadaExpression;

public class ThreadDemoUsingLambda {
    public static void main(String[] args) {
        // first thread :Thread JOHN

        Runnable thread1 = () -> {
            // this is the body of the thread
            for (int i = 1; i <= 10; i++) {
                System.out.println("value of i " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t = new Thread(thread1);
        t.setName("JOHN");
        t.start();

        Runnable t2 = ()->{
            try{
                for(int i = 1; i <= 10; i++){
                    System.out.println(i*2);
                    Thread.sleep(2000);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        };

        Thread t22 = new Thread(t2);
        t22.start();

    }
}
