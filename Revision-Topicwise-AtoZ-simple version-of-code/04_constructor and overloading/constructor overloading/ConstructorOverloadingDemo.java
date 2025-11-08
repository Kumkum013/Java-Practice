// ConstructorOverloadingDemo.java
class Box {
    double width, height, depth;

    // Default constructor
    Box() {
        width = height = depth = 1;
        System.out.println("Default constructor called.");
    }

    // Parameterized constructor
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
        System.out.println("Parameterized constructor called.");
    }

    // Single parameter constructor (cube)
    Box(double side) {
        width = height = depth = side;
        System.out.println("Cube constructor called.");
    }

    double volume() {
        return width * height * depth;
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        Box b1 = new Box();            // calls default
        Box b2 = new Box(2, 3, 4);     // calls 3-arg
        Box b3 = new Box(5);           // calls 1-arg (cube)

        System.out.println("Volume of b1 = " + b1.volume());
        System.out.println("Volume of b2 = " + b2.volume());
        System.out.println("Volume of b3 = " + b3.volume());
    }
}

