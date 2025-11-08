// MethodOverloadingExample.java
class Calculator {
    // add two integers
    int add(int a, int b) {
        return a + b;
    }

    // add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // add two double numbers
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Sum (int, int): " + c.add(2, 3));
        System.out.println("Sum (int, int, int): " + c.add(1, 2, 3));
        System.out.println("Sum (double, double): " + c.add(2.5, 3.5));
    }
}
