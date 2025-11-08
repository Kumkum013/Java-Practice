// MethodOverriding.java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound() method
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();

        a.sound();  // Calls Animal class method
        d.sound();  // Calls Dog class method (overridden)
    }
}
