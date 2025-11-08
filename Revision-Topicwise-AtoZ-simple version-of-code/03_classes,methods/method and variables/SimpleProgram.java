// SimpleProgram.java
public class SimpleProgram {
    
    // variables
    int a = 5;
    int b = 10;
    String name = "Kumkum";

    // method 1
    void showNumbers() {
        System.out.println("a = " + a + ", b = " + b);
    }

    // method 2
    void addNumbers() {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }

    // method 3
    void showName() {
        System.out.println("Name is: " + name);
    }

    // main method
    public static void main(String[] args) {
        SimpleProgram obj = new SimpleProgram();

        obj.showNumbers();  // call method 1
        obj.addNumbers();   // call method 2
        obj.showName();     // call method 3
    }
}
