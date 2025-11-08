// CombinedPractical.java
import java.util.Scanner;

public class CombinedPractical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task 1: Celsius to Fahrenheit
        System.out.print("Enter Celsius: ");
        double c = sc.nextDouble();
        double f = (c * 9/5) + 32;
        System.out.println(c + "C = " + f + "F");

        // Task 2: Even or Odd
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        String parity = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + parity);

        // Task 3: Swap two numbers without temp (using arithmetic)
        System.out.print("Enter two ints a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swap: a=" + a + ", b=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap (arithmetic): a=" + a + ", b=" + b);

        // Task 4: ASCII of char
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println("ASCII of " + ch + " = " + (int) ch);

        sc.close();
    }
}

