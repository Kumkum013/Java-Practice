// InputOutputDemo.java
import java.util.Scanner;  // Import Scanner class for input

public class InputOutputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object

        // Taking input from user
        System.out.print("Enter your name: ");
        String name = sc.nextLine();   // Reads a line of text

        System.out.print("Enter your age: ");
        int age = sc.nextInt();        // Reads an integer

        // Displaying output
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");

        sc.close();  // Close scanner
    }
}
