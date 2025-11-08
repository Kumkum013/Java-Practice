// AnonymousClassExample.java

// Step 1: Create an interface
interface Animal {
    void sound();
}

// Step 2: Main class
public class AnonymousClassExample {
    public static void main(String[] args) {
        
        // Step 3: Create anonymous class implementing Animal
        Animal dog = new Animal() {
            public void sound() {
                System.out.println("Dog barks");
            }
        };

        // Step 4: Call the method
        dog.sound();
    }
}
