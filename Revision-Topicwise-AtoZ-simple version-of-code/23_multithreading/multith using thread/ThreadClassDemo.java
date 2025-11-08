// ThreadClassDemo.java
class MyThread extends Thread {
    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println(getName() + " is running: " + i);
        }
    }
}

public class ThreadClassDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread A");
        t2.setName("Thread B");

        t1.start();
        t2.start();
    }
}
