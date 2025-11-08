// StudentArrayDemo.java
class StudentData {
    private String name;
    private int roll;
    private double marks;

    public void setData(String n, int r, double m) {
        name = n;
        roll = r;
        marks = m;
    }

    public void display() {
        System.out.println("Name: " + name + ", Roll: " + roll + ", Marks: " + marks);
    }
}

public class StudentArrayDemo {
    public static void main(String[] args) {
        StudentData[] students = new StudentData[3];

        students[0] = new StudentData();
        students[0].setData("Aman", 1, 89.5);

        students[1] = new StudentData();
        students[1].setData("Kumkum", 2, 92.3);

        students[2] = new StudentData();
        students[2].setData("Ravi", 3, 75.2);

        for (StudentData s : students)
            s.display();
    }
}

