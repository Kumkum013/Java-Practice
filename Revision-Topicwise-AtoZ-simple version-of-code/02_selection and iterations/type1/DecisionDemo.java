// DecisionDemo.java
import java.util.Scanner;

public class DecisionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        // Simple if
        if (marks == 100) {
            System.out.println("Perfect score!");
        }

        // if-else
        if (marks >= 40) {
            System.out.println("You passed!");
        } else {
            System.out.println("You failed!");
        }

        // if-else-if ladder
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        sc.close();
    }
}
