import java.io.*;

public class FileWriteDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("example.txt");
            fw.write("Hello, this is a file handling example.\n");
            fw.write("Second line of text.");
            fw.close();
            System.out.println("File written successfully");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }
    }
}
