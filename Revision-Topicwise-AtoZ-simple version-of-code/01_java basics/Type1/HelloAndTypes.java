// HelloAndTypes.java
public class HelloAndTypes {
    public static void main(String[] args) {
        // 1. Hello world
        System.out.println("Hello, World!");

        // 2. Primitive declarations with sample literals
        byte b = 10;                 // 8-bit integer
        short s = 2000;              // 16-bit integer
        int i = 1_000_000;           // 32-bit integer (underscore allowed for readability)
        long l = 1234567890123L;     // 64-bit integer (L suffix)
        float f = 3.14f;             // 32-bit float (f suffix)
        double d = 2.718281828;      // 64-bit double
        char ch = 'A';               // character literal
        boolean bool = true;         // boolean

        // 3. Print them
        System.out.println("byte b = " + b);
        System.out.println("short s = " + s);
        System.out.println("int i = " + i);
        System.out.println("long l = " + l);
        System.out.println("float f = " + f);
        System.out.println("double d = " + d);
        System.out.println("char ch = " + ch);
        System.out.println("boolean bool = " + bool);
    }
}
