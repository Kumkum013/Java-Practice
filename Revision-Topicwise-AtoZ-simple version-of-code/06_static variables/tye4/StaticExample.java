// StaticExample.java
class Student {
    static String college = "VCET"; // shared by all
    String name;
    int roll;

    Student(String n, int r) {
        name = n;
        roll = r;
    }

    void display() {
        System.out.println(roll + " - " + name + " (" + college + ")");
    }

    static void changeCollege(String newCollege) {
        college = newCollege; // static method changes static variable
    }
}

public class StaticExample {
    public static void main(String[] args) {
        Student s1 = new Student("Kumkum", 1);
        Student s2 = new Student("Ravi", 2);

        s1.display();
        s2.display();

        Student.changeCollege("Mumbai University"); // call static method

        s1.display();
        s2.display();
    }
}

