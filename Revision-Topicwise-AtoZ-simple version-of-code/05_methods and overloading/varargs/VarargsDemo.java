// VarargsDemo.java
public class VarargsDemo {
    static int sum(int... numbers) {
        int total = 0;
        for (int n : numbers)
            total += n;
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 2,3 = " + sum(2, 3));
        System.out.println("Sum of 1,2,3,4,5 = " + sum(1, 2, 3, 4, 5));
    }
}
