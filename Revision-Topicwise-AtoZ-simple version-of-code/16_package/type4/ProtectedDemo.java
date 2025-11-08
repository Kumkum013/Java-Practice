class Parent {
    protected int num = 100;
}

class Child extends Parent {
    void show() {
        System.out.println("Protected num in child: " + num);
    }
}

public class ProtectedDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
