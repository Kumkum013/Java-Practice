// EmployeeDemo.java
class Employee {
    private String name;
    private double salary;
    private String department;

    // Constructor
    public Employee(String n, double s, String d) {
        name = n;
        salary = s;
        department = d;
    }

    // getter methods
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public String getDepartment() { return department; }

    public void displayInfo() {
        System.out.println("Employee: " + name + ", Department: " + department + ", Salary: " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Aman", 55000, "IT");
        e1.displayInfo();
    }
}

