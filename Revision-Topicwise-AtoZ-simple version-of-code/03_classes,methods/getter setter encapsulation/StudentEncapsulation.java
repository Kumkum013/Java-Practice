// StudentEncapsulation.java
class Student {
    // private data members
    private String name;
    private int rollNo;
    private double marks;

    // setter methods (to assign values)
    public void setName(String n) { name = n; }
    public void setRollNo(int r) { rollNo = r; }
    public void setMarks(double m) { marks = m; }

    // getter methods (to access values)
    public String getName() { return name; }
    public int getRollNo() { return rollNo; }
    public double getMarks() { return marks; }

    // display method
    public void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Marks: " + marks);
    }
}

public class StudentEncapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Kumkum");
        s1.setRollNo(101);
        s1.setMarks(89.5);

        s1.display();

        System.out.println("Name via getter: " + s1.getName());
    }
}

