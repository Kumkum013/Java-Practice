// RecursionDemo.java
import java.util.Scanner;

public class RecursionDemo {
    // Recursive function
    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1); // recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " = " + factorial(num));
        sc.close();
    }
}
