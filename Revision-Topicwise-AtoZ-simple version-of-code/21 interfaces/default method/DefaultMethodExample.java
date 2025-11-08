// DefaultMethodExample.java

interface Animal {
    void sound();  // normal abstract method

    // default method
    default void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class DefaultMethodExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();  // calls abstract method
        d.eat();    // calls default method from interface
    }
}
