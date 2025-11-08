// RunnableDemo.java
class MyRunnable implements Runnable {
    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " is running: " + i);
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "Thread 1");
        Thread t2 = new Thread(new MyRunnable(), "Thread 2");

        t1.start();
        t2.start();
    }
}
