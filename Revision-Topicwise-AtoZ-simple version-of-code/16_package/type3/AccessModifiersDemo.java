class Example {
    private int privateVar = 10;
    int defaultVar = 20; // default
    protected int protectedVar = 30;
    public int publicVar = 40;

    void display() {
        System.out.println("Private: " + privateVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);
    }
}

public class AccessModifiersDemo {
    public static void main(String[] args) {
        Example ex = new Example();
        ex.display();
        // Accessing public variable directly
        System.out.println("Public Var: " + ex.publicVar);
    }
}

