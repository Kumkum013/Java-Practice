class Employee {
    String name;
    double basicSalary;

    Employee(String n, double sal) {
        name = n;
        basicSalary = sal;
    }

    double calculateGross() {
        double hra = 0.1 * basicSalary; // HRA 10%
        double ta = 0.05 * basicSalary; // TA 5%
        return basicSalary + hra + ta;
    }

    void display() {
        System.out.println("Employee: " + name);
        System.out.println("Gross Salary: " + calculateGross());
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Kumkum", 50000);
        Employee e2 = new Employee("Rahul", 60000);

        e1.display();
        e2.display();
    }
}
