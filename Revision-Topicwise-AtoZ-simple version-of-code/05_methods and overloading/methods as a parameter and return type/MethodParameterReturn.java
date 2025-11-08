// MethodParameterReturn.java
public class MethodParameterReturn {

    // method with return type
    int add(int a, int b) {
        return a + b;
    }

    // method that takes method result (return value) as parameter
    void display(int result) {
        System.out.println("Result is: " + result);
    }

    public static void main(String[] args) {
        MethodParameterReturn obj = new MethodParameterReturn();

        // calling add() and passing its return value to display()
        obj.display(obj.add(5, 10));
    }
}
