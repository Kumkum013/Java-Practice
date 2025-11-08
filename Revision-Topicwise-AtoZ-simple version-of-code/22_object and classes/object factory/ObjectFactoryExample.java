// ObjectFactoryExample.java

// Step 1: Create an interface
interface Animal {
    void sound();
}

// Step 2: Create classes that implement the interface
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

// Step 3: Create a Factory class that makes objects
class AnimalFactory {
    public static Animal getAnimal(String type) {
        if (type.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("cat")) {
            return new Cat();
        } else {
            return null;
        }
    }
}

// Step 4: Main class
public class ObjectFactoryExample {
    public static void main(String[] args) {
        Animal a1 = AnimalFactory.getAnimal("dog"); // factory creates Dog object
        Animal a2 = AnimalFactory.getAnimal("cat"); // factory creates Cat object

        a1.sound();
        a2.sound();
    }
}
