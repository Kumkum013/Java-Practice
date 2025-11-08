// ConstructorChaining.java
class StudentChain {
    String name;
    int roll;
    double marks;

    // Default constructor
    StudentChain() {
        this("Unknown", 0, 0.0); // calls 3-arg constructor
        System.out.println("Default constructor called.");
    }

    // Parameterized constructor
    StudentChain(String name, int roll, double marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
        System.out.println("Parameterized constructor called.");
    }

    void display() {
        System.out.println("Name: " + name + ", Roll: " + roll + ", Marks: " + marks);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        StudentChain s1 = new StudentChain();
        StudentChain s2 = new StudentChain("Kumkum", 102, 91.3);
        s1.display();
        s2.display();
    }
}
