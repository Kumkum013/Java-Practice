// BitwiseDemo.java
public class BitwiseDemo {
    public static void printBin(int x) {
        System.out.println(x + " -> " + Integer.toBinaryString(x));
    }

    public static void main(String[] args) {
        int x = 5;  // 0101
        int y = 3;  // 0011

        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x & y = " + (x & y)); // AND
        System.out.println("x | y = " + (x | y)); // OR
        System.out.println("x ^ y = " + (x ^ y)); // XOR
        System.out.println("~x = " + (~x));       // NOT (two's complement)
        System.out.println("x << 2 = " + (x << 2));  // left shift
        System.out.println("x >> 1 = " + (x >> 1));  // signed right shift
        System.out.println("x >>> 1 = " + (x >>> 1)); // unsigned right shift

        // Negative number shifts
        int neg = -5;
        System.out.println("-5 in binary: " + Integer.toBinaryString(neg));
        System.out.println("-5 >> 1 = " + (neg >> 1));
        System.out.println("-5 >>> 1 = " + (neg >>> 1));
    }
}
