// PolymorphismExample.java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal a;  // reference of parent class

        a = new Dog();  // Dog object
        a.sound();      // calls Dog's version

        a = new Cat();  // Cat object
        a.sound();      // calls Cat's version
    }
}
