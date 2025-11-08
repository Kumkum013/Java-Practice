// MethodOverloadDemo.java
class MathUtil {
    // same method name, different parameters
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class MethodOverloadDemo {
    public static void main(String[] args) {
        MathUtil m = new MathUtil();
        System.out.println("add(int,int): " + m.add(2, 3));
        System.out.println("add(double,double): " + m.add(2.5, 3.5));
        System.out.println("add(int,int,int): " + m.add(1, 2, 3));
    }
}
