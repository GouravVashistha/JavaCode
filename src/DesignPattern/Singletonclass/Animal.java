package DesignPattern.Singletonclass;

/*
 Lazy Initialization Singleton (Not Thread-Safe)
 📌 Why Lazy Initialization?
Instance tabhi create hota hai jab zarurat ho — yaani first time getInstance() call hota hai.
Memory efficient hai, kyunki jab tak object ki jarurat nahi, tab tak bana nahi.

📛 But NOT Thread-Safe
Agar multiple threads same time pe getInstance() call karein, to object do baar bhi ban sakta hai,
which breaks the singleton rule.
Example:-
            Thread t1 = new Thread(() -> {
                Animal a1 = Animal.getInstance();
            });

            Thread t2 = new Thread(() -> {
                Animal a2 = Animal.getInstance();
            });
Agar a1 aur a2 different threads mein simultaneously call hote hain,
aur dono ko single_instance == null mile, to do instance ban sakte hain. ❌

Solution: Thread-Safe Version :- Using synchronized method
 */


public class Animal {
    //  Yeh hi wo object hai jo ek baar banne ke baad baar-baar return hoga — Singleton instance.
    private static Animal single_instance = null;

    private Animal() {
        // Singleton ka golden rule: Constructor private hona chahiye.
    }

    public static Animal getInstance() {
        if (single_instance == null) {
            single_instance = new Animal();
        }
        return single_instance;
    }

    public static void main(String[] args) {
        Animal a1 = Animal.getInstance();
        Animal a2 = Animal.getInstance();

        System.out.println(a1 == a2); // true (Same instance)

        //Singleton ka golden rule: Constructor private hona chahiye.
    }
}
