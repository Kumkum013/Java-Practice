import java.io.*;

public class AppendDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("example.txt", true); // true → append mode
            fw.write("\nAppending a new line.");
            fw.close();
            System.out.println("Text appended successfully");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
