// IfSwitchDemo.java
import java.util.Scanner;

public class IfSwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks (0-100): ");
        int marks = sc.nextInt();

        // Using if statement to check pass or fail
        if (marks >= 40) {
            System.out.println("You passed the exam!");

            // Using switch to give grade based on marks
            int grade = marks / 10; // to get range like 9 for 90–99

            switch (grade) {
             
                case 9:
                    System.out.println("Grade: A");
                    break;
                case 8:
                    System.out.println("Grade: B");
                    break;
                case 7:
                    System.out.println("Grade: C");
                    break;
                case 6:
                    System.out.println("Grade: D");
                    break;
                case 5:
                case 4:
                    System.out.println("Grade: E");
                    break;
                default:
                    System.out.println("Grade: F");
            }
        } else {
            System.out.println("You failed the exam.");
        }

        sc.close();
    }
}
