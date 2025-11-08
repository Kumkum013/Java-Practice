// MenuProgram.java
import java.util.Scanner;

public class MenuProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Find Factorial");
            System.out.println("2. Check Even or Odd");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter number: ");
                    int n = sc.nextInt();
                    int fact = 1;
                    for (int i = 1; i <= n; i++)
                        fact *= i;
                    System.out.println("Factorial = " + fact);
                }
                case 2 -> {
                    System.out.print("Enter number: ");
                    int num = sc.nextInt();
                    System.out.println(num % 2 == 0 ? "Even" : "Odd");
                }
                case 3 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice");
            }
        } while (choice != 3);
        sc.close();
    }
}
