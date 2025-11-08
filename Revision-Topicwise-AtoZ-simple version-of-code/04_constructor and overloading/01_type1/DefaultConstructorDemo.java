// DefaultConstructorDemo.java
class Student {
    String name;
    int roll;
    double marks;

    // Default constructor
    Student() {
        name = "Unknown";
        roll = 0;
        marks = 0.0;
        System.out.println("Default constructor called.");
    }

    void display() {
        System.out.println("Name: " + name + ", Roll: " + roll + ", Marks: " + marks);
    }
}

public class DefaultConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student();  // default constructor runs automatically
        s1.display();
    }
}
