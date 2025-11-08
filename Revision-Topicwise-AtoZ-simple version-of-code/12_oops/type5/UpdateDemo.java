class Student {
    private String name;
    private int roll;

    void setName(String n) { name = n; }
    void setRoll(int r) { roll = r; }

    void display() {
        System.out.println("Name: " + name + ", Roll: " + roll);
    }
}

public class UpdateDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Kumkum");
        s.setRoll(101);
        s.display();
    }
}
