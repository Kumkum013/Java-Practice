// ThreadJoinDemo.java
class JoinThread extends Thread {
    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println(getName() + " : " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadJoinDemo {
    public static void main(String[] args) {
        JoinThread t1 = new JoinThread();
        JoinThread t2 = new JoinThread();

        t1.start();
        try {
            t1.join(); // main waits until t1 finishes
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
    }
}
