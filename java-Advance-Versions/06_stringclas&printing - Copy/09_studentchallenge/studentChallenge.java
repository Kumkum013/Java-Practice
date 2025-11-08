

public class studentChallenge 
{
    public static void main(String[]args)
    {
        String str1="kumkumm2317@gmail.com";

        int i=str1.indexOf("@");

        String uname=str1.substring
        (0,i);
        String domain=str1.substring(i+1,

        
        str1.length());


        System.out .println( "Username:"+uname);
          
         System.out.println("Domain:"+domain);

          System.out.println(domain.startsWith("gmail"));

int j=domain.indexOf(".");
String name=domain.substring(0,j);
 System.out.println(name.equals ("gmail"));




    }
}
