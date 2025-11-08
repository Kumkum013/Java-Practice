// BreakContinueDemo.java
public class BreakContinueDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Break at i = " + i);
                break;  // exits the loop completely
            }
            System.out.println(i);
        }

        System.out.println("\nContinue example:");
        for (int j = 1; j <= 5; j++) {
            if (j == 3) continue; // skip this iteration
            System.out.println("j = " + j);
        }
    }
}

