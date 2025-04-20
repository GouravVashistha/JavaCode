package DesignPattern.Singletonclass;
/*
Thread Safe Singleton: A thread safe singleton is created so that singleton property is maintained even
 in multithreaded environment. To make a singleton class thread safe,
 getInstance() method is made synchronized so that multiple threads can’t access it simultaneously.


 Note:- But ye thoda slow ho sakta hai due to method-level lock.
 */

//Thread-Safe Singleton (Method-Level Synchronization)
public class Animalsynchronizedway {
    private static Animalsynchronizedway single_instance = null;

    private  Animalsynchronizedway(){

    }
    public static synchronized  Animalsynchronizedway getInstance(){
        if(single_instance ==null){
            single_instance = new Animalsynchronizedway();
        }
        return  single_instance;
    }

    public static void main(String args[]){
        Runnable task =()->{
           Animalsynchronizedway instance = Animalsynchronizedway.getInstance();
            System.out.println("Instance hash: " + instance.hashCode());
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();
    }
}
