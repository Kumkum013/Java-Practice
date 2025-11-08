// NestedIfDemo.java
import java.util.Scanner;

public class NestedIfDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter nationality: ");
        String nation = sc.next();

        if (nation.equalsIgnoreCase("Indian")) {
            if (age >= 18) {
                System.out.println("Eligible to vote in India");
            } else {
                System.out.println("Not eligible due to age");
            }
        } else {
            System.out.println("Not eligible (not an Indian citizen)");
        }

        sc.close();
    }
}
