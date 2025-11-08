// FinalExample.java
class Vehicle {
    final int wheels = 4; // constant value

    final void displayType() {
        System.out.println("This vehicle has " + wheels + " wheels.");
    }
}

class Car extends Vehicle {
    // void displayType() {} // ERROR: cannot override final method
}

public class FinalExample {
    public static void main(String[] args) {
        Car c = new Car();
        c.displayType();
    }
}
