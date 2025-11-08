class ParentClass {
    int x;
    ParentClass(int a) {
        x = a;
    }
    void display() {
        System.out.println("Parent x = " + x);
    }
}

class ChildClass extends ParentClass {
    int y;
    ChildClass(int a, int b) {
        super(a); // call parent constructor
        y = b;
    }
    void display() {
        super.display(); // call parent method
        System.out.println("Child y = " + y);
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass(10, 20);
        obj.display();
    }
}
