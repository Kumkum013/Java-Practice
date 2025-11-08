// ObjectClassExample.java

class Student {
    // variables (data members)
    int rollNo;
    String name;

    // method (member function)
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

public class ObjectClassExample {
    public static void main(String[] args) {
        // creating first object
        Student s1 = new Student();
        s1.rollNo = 101;
        s1.name = "Kumkum";
        s1.display();

        System.out.println(); // for spacing

        // creating second object
        Student s2 = new Student();
        s2.rollNo = 102;
        s2.name = "Rahul";
        s2.display();
    }
}
