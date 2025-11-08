// ImplementsExample.java

// Step 1: Create an interface
interface Animal {
    void sound();   // abstract method
    void eat();     // abstract method
}

// Step 2: Create a class that implements the interface
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void eat() {
        System.out.println("Dog eats bones");
    }
}

// Step 3: Main class
public class ImplementsExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.eat();
    }
}
