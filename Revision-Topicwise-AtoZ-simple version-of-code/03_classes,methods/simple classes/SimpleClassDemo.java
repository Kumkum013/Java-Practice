// SimpleClassDemo.java
class Car {
    String brand;
    int year;

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class SimpleClassDemo {
    public static void main(String[] args) {
        Car car1 = new Car(); // creating object
        car1.brand = "Tata";
        car1.year = 2023;
        car1.displayInfo();
    }
}
