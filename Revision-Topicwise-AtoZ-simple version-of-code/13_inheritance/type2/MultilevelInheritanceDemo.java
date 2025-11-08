class Grandparent {
    void grandparentMethod() {
        System.out.println("Grandparent method");
    }
}

class Parent extends Grandparent {
    void parentMethod() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    void childMethod() {
        System.out.println("Child method");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.grandparentMethod();
        c.parentMethod();
        c.childMethod();
    }
}
