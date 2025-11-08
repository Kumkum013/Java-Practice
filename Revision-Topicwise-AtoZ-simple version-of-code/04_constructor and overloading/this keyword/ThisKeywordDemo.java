// ThisKeywordDemo.java
class Employee {
    String name;
    double salary;

    // Constructor with same parameter names
    Employee(String name, double salary) {
        this.name = name;       // 'this' refers to current object's variable
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee: " + name + ", Salary: " + salary);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Aman", 60000);
        e1.display();
    }
}
