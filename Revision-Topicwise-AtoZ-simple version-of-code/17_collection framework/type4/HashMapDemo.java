import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "John");
        map.put(2, "Alice");
        map.put(3, "Bob");

        System.out.println("HashMap: " + map);

        // Access value by key
        System.out.println("Value for key 2: " + map.get(2));

        // Remove entry
        map.remove(3);
        System.out.println("After removal: " + map);

        // Iterate
        System.out.println("Iterating HashMap:");
        for(Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
