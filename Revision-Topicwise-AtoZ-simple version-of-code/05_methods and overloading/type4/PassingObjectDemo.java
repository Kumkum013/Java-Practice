// PassingObjectDemo.java
class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean isEqual(Test obj) {
        return (obj.a == a && obj.b == b);
    }
}

public class PassingObjectDemo {
    public static void main(String[] args) {
        Test t1 = new Test(10, 20);
        Test t2 = new Test(10, 20);
        Test t3 = new Test(5, 6);

        System.out.println("t1 == t2 ? " + t1.isEqual(t2));
        System.out.println("t1 == t3 ? " + t1.isEqual(t3));
    }
}

