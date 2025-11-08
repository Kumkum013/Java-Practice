

import java.io.*;

public class FileExample {

    public static void main(String[] args) throws Exception
    {
        
        String str="learn Java Programming.";
        
        try(FileInputStream fis=new FileInputStream("C:/MyJava/Test.txt");)
        
        {
        byte b[]=new byte[fis.available()];
        fis.read(b);

        String str=new String(b);
        System.out.println(str);
        
        }
        // catch(FileNotFoundException e)
        // {
        //     System.out.println(e);
        // }
        // catch(IOException e)
        // {
        //     System.out.println(e);
        //     System.out.println("program executed successfully");
        // }
    }
   
    
}