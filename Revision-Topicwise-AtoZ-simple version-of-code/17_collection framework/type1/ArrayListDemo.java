import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println("ArrayList: " + list);

        // Access element
        System.out.println("First Element: " + list.get(0));

        // Remove element
        list.remove("Banana");
        System.out.println("After removal: " + list);

        // Iterate
        System.out.println("Iterating:");
        for(String fruit : list) {
            System.out.println(fruit);
        }
    }
}
