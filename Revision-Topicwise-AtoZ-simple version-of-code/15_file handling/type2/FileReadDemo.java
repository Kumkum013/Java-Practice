import java.io.*;

public class FileReadDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("example.txt");
            int i;
            while((i = fr.read()) != -1) {
                System.out.print((char)i);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }
    }
}
