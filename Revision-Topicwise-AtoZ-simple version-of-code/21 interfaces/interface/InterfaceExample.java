  
// InterfaceExample.java

// Step 1: Define an interface
interface Animal {
    void sound();   // abstract method
    void eat();     // abstract method
}

// Step 2: Class implements the interface
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void eat() {
        System.out.println("Dog eats bones");
    }
}

// Step 3: Main class
public class InterfaceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.eat();
    }
}

