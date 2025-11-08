// StaticDemo.java
class Counter {
    static int count = 0; // shared by all objects

    Counter() {
        count++;
        System.out.println("Object created. Total: " + count);
    }

    static void showCount() {
        System.out.println("Total objects created: " + count);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        Counter.showCount(); // call static method without object
    }
}

