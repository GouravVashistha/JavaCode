package DesignPattern.Singletonclass;

/*
Lazy initialization with Double check locking: In this mechanism, we overcome the overhead problem of synchronized
code. In this method, getInstance is not synchronized but the block which creates instance is synchronized
so that minimum number of threads have to wait and that’s only for first time.
🛡️ Why 2 Checks?
Ek baar check karna kafi nahi hota multi-threaded environment me.
Double-checked locking ensures:
    Only one thread actually creates the instance
    Baaki threads bina lock ke fast access lete hain.

 */
public class LazyInitializationWithDoublechecklocking {
    private static  volatile  LazyInitializationWithDoublechecklocking single_instance = null;

    // private instance, so that it can be
    // accessed by only by getInstance() method
    private LazyInitializationWithDoublechecklocking(){

    }

    public static LazyInitializationWithDoublechecklocking getInstance() {
        if (single_instance == null) { // First check (no locking)
            synchronized (LazyInitializationWithDoublechecklocking.class) { // Locking
                if (single_instance == null) { // Second check (inside lock)
                    single_instance = new LazyInitializationWithDoublechecklocking(); // Create instance
                }
            }
        }
        return single_instance;
    }
}
