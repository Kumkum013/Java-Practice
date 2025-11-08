class Vehicle {
    void displayType() {
        System.out.println("I am a vehicle");
    }
}

class Car extends Vehicle {
    void carType() {
        System.out.println("I am a car");
    }
}

class Bike extends Vehicle {
    void bikeType() {
        System.out.println("I am a bike");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();
        c.displayType();
        c.carType();
        b.displayType();
        b.bikeType();
    }
}
