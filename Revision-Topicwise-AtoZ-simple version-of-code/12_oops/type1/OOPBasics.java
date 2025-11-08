class Student {
    String name;
    int roll;

    // Constructor
    Student(String n, int r) {
        name = n;
        roll = r;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }
}

public class OOPBasics {
    public static void main(String[] args) {
        Student s1 = new Student("Kumkum", 101);
        Student s2 = new Student("Rahul", 102);

        s1.display();
        s2.display();
    }
}
