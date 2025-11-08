class Person {
    String name;
    void setName(String n) {
        name = n;
    }
}

class Student extends Person {
    int roll;
    void setRoll(int r) {
        roll = r;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Kumkum");
        s.setRoll(101);
        s.display();
    }
}

