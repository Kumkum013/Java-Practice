// ThreadSleepDemo.java
class SleepThread extends Thread {
    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println(getName() + " running: " + i);
            try {
                Thread.sleep(1000); // sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadSleepDemo {
    public static void main(String[] args) {
        SleepThread t1 = new SleepThread();
        SleepThread t2 = new SleepThread();

        t1.start();
        t2.start();
    }
}
