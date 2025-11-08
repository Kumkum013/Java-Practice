// LoopDemo.java
public class LoopDemo {
    public static void main(String[] args) {

        // 1. for loop
        System.out.println("For loop (1 to 5):");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // 2. while loop
        System.out.println("\nWhile loop (5 to 1):");
        int j = 5;
        while (j >= 1) {
            System.out.println(j);
            j--;
        }

        // 3. do-while loop
        System.out.println("\nDo-while loop (runs once even if false):");
        int k = 6;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);
    }
}
