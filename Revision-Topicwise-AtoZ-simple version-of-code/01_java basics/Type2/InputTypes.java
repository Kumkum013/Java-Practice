// InputTypes.java
import java.util.Scanner;

public class InputTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int x = sc.nextInt();           // reads int
        System.out.print("Enter a double: ");
        double y = sc.nextDouble();     // reads double
        sc.nextLine(); // consume newline
        System.out.print("Enter a line of text: ");
        String line = sc.nextLine();

        System.out.println("You entered int: " + x + ", double: " + y + ", text: " + line);
        sc.close();
    }
}
