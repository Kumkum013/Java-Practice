// ParameterizedConstructorDemo.java
class StudentParam {
    String name;
    int roll;
    double marks;

    // Parameterized constructor
    StudentParam(String n, int r, double m) {
        name = n;
        roll = r;
        marks = m;
        System.out.println("Parameterized constructor called.");
    }

    void display() {
        System.out.println("Name: " + name + ", Roll: " + roll + ", Marks: " + marks);
    }
}

public class ParameterizedConstructorDemo {
    public static void main(String[] args) {
        StudentParam s1 = new StudentParam("Kumkum", 101, 89.5);
        s1.display();
    }
}

