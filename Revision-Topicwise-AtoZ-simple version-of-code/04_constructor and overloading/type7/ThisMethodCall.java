// ThisMethodCall.java
class Calculator {
    void showMessage() {
        System.out.println("Welcome to Calculator!");
    }

    void addNumbers(int a, int b) {
        this.showMessage();  // calling another method of same class
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}

public class ThisMethodCall {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.addNumbers(5, 10);
    }
}
