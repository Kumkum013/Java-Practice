
import java.util.*;   // for List, Arrays
import java.util.stream.*;  // for Stream

public class StreamDemo {
    public static void main(String[] args) {
        // Create a list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Use Stream API to filter even numbers and print them
        System.out.println("Even numbers:");
        numbers.stream()               // Create stream
               .filter(n -> n % 2 == 0) // Keep only even numbers
               .forEach(n -> System.out.println(n)); // Print each
    }
}
