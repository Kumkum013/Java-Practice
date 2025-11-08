// AbstractAndInterface.java

// Step 1: Create an interface
interface Animal {
    void sound();  // abstract method (no body)
}

// Step 2: Create an abstract class that implements the interface
abstract class Pet implements Animal {
    abstract void play();  // abstract method
    void sleep() {         // normal (non-abstract) method
        System.out.println("Pet is sleeping");
    }
}

// Step 3: Create a subclass that provides full implementation
class Dog extends Pet {
    public void sound() {
        System.out.println("Dog barks");
    }

    void play() {
        System.out.println("Dog is playing");
    }
}

// Step 4: Main class
public class AbstractAndInterface {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.play();
        d.sleep();
    }
}
