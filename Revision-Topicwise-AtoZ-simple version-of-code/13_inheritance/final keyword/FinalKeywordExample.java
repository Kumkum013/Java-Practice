// FinalKeywordExample.java
class Animal {
    final void sound() {
        System.out.println("Animals make sounds");
    }
}

// Dog class trying to override final method
class Dog extends Animal {
    // ❌ This will cause an error if uncommented:
    // void sound() {
    //     System.out.println("Dog barks");
    // }

    void display() {
        System.out.println("Dog class method");
    }
}

public class FinalKeywordExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();   // calls final method from parent
        d.display();
    }
}
