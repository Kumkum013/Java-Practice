import java.util.Scanner;

public class StudentChallenge 
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner((System.in));
         /*  System.out.println("Enter a No of days");
        int day=scan.nextInt();
        if(day==1)
        {
            System.out.println("monday");
        }
        else if(day==2)
        {
            System.out.println("tuesday");
        }
        else if(day==3)
        {
            System.out.println("wednesday");
        }
        else if(day==4)
        {
            System.out.println("thursday");
        }

        else if(day==5)
        {
            System.out.println("friday");
        }

        else if(day==6)
        {
            System.out.println("saturday");
    
        }
        else if(day==7)
        {
            System.out.println("sunday");
    
        }*/

// Type of website

        System.out.println("Enter a URL");

        String url=scan.nextLine();

        String protocal = url.substring(0,url.indexOf(""));
        if(protocal.equals("http"))
        System.out.println("Hypertext Transfer Protocal ");

        else if(protocal. equals("ftp"))

              System.out.println("file Transfer protocal");
              
        String ext=url.substring(url.lastIndexOf(" .")+1);
        if(ext.equals("com"))

            System.out.println("Commercial");

        else if(ext.equals("org"))

            System.out.println("Organisation");

        else if(ext.equals("net"))
             System.out.println("Network");   












    }   
}
