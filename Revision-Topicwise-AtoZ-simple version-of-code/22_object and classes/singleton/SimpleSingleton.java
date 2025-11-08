// SimpleSingleton.java

class Singleton {
    // Step 1: Create a static object of the same class
    private static Singleton obj = new Singleton();

    // Step 2: Make the constructor private
    private Singleton() {}

    // Step 3: Provide a static method to get the object
    public static Singleton getInstance() {
        return obj;
    }

    // Step 4: Example method
    void show() {
        System.out.println("Hello! I am a Singleton object.");
    }
}

public class SimpleSingleton {
    public static void main(String[] args) {
        // Getting the same instance every time
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.show();

        // Check if both are same object
        System.out.println(s1 == s2); // prints true
    }
}
