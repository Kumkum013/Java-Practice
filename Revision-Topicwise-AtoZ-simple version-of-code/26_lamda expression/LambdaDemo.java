// LambdaDemo.java
interface Greeting {
    void sayHello(String name);
}

public class LambdaDemo {
    public static void main(String[] args) {
        // Using Lambda Expression instead of implementing the interface separately
        Greeting greet = (name) -> {
            System.out.println("Hello, " + name + "!");
        };

        // Calling the method
        greet.sayHello("Kumkum");
    }
}
