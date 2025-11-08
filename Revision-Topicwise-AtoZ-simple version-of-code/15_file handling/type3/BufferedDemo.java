import java.io.*;

public class BufferedDemo {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("buffered.txt"));
            bw.write("This is written using BufferedWriter.\n");
            bw.write("Second line.");
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader("buffered.txt"));
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
