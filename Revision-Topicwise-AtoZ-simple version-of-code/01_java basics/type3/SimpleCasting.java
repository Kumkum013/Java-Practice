// Simple Type Casting Program
public class SimpleCasting {
    public static void main(String[] args) {
        int a = 5;            // integer value
        double b = a;         // widening: int → double
        System.out.println("After widening: " + b);

        double c = 9.8;       // double value
        int d = (int) c;      // narrowing: double → int
        System.out.println("After narrowing: " + d);
    }
}
