import java.util.Scanner;

public class FunctionsDemo {
    // Method to add two numbers
    static int add(int a, int b) {
        return a + b;
    }

    // Method to find factorial
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Sum: " + add(x, y));

        System.out.print("Enter number to find factorial: ");
        int num = sc.nextInt();
        System.out.println("Factorial: " + factorial(num));

        sc.close();
    }
}
