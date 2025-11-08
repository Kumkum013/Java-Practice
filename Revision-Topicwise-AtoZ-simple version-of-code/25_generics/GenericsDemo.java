// GenericsDemo.java
class Box<T> {     // 'T' is a type parameter
    private T value;

    // Set value
    public void set(T value) {
        this.value = value;
    }

    // Get value
    public T get() {
        return value;
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        // Create a Box for Integer type
        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        System.out.println("Integer value: " + intBox.get());

        // Create a Box for String type
        Box<String> strBox = new Box<>();
        strBox.set("Hello Generics");
        System.out.println("String value: " + strBox.get());
    }
}
