import java.io.*;

public class BufferedDemo 
{
    public static void main(String[] args) throws Exception 
    {
    //     FileInputStream fis = new FileInputStream("Test.txt"); // Use correct path if needed
    //     BufferedInputStream bis = new BufferedInputStream(fis);

    //     // Example: Read and print first few bytes
    //     System.out.print((char)bis.read());
    //     System.out.print((char)bis.read());
    //     System.out.print((char)bis.read());

    //     bis.close();
    //     fis.close();
    // }    





   
    {
        FileReader fis = new FileReader("Test.txt");
        BufferedReader bis = new BufferedReader(fis);

        System.out.println("String " + bis.readLine());

        bis.close();
        fis.close();
    }    
}
}