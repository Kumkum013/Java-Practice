import java.io.File;

public class FileOpsDemo {
    public static void main(String[] args) {
        File file = new File("example.txt");

        if(file.exists()) {
            System.out.println("File exists");
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            if(file.delete()) {
                System.out.println("File deleted successfully");
            } else {
                System.out.println("Failed to delete file");
            }
        } else {
            System.out.println("File does not exist");
        }
    }
}

