// WrapperDemo.java
public class WrapperDemo {
    public static void main(String[] args) {
        // Boxing / Unboxing (autoboxing introduced in Java 5)
        Integer obj = 10; // autoboxing from int to Integer
        int prim = obj;   // unboxing

        // parseInt and valueOf
        String s1 = "123";
        int n = Integer.parseInt(s1);       // returns primitive int
        Integer oi = Integer.valueOf(s1);   // returns Integer object

        System.out.println("n = " + n + ", oi = " + oi);

        // NumberFormatException handling
        try {
            int bad = Integer.parseInt("12a3"); // will throw
        } catch (NumberFormatException ex) {
            System.out.println("Caught NumberFormatException: " + ex.getMessage());
        }

        // == vs equals for wrappers
        Integer a = 100; // cached by Integer.valueOf for -128..127
        Integer b = 100;
        Integer A = 1000; // outside cache range
        Integer B = 1000;

        System.out.println("a==b? " + (a == b)); // true because of caching
        System.out.println("A==B? " + (A == B)); // false, different objects
        System.out.println("A.equals(B)? " + A.equals(B)); // true: equals compares value

        // toString
        String t = Integer.toString(500);
        System.out.println("toString: " + t);
    }
}
