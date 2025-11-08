import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("LinkedList: " + numbers);

        // Add at first and last
        numbers.addFirst(5);
        numbers.addLast(35);
        System.out.println("After addFirst & addLast: " + numbers);

        // Remove first and last
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println("After removeFirst & removeLast: " + numbers);
    }
}
