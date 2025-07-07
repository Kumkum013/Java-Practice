import java.util.*;

public class Radix 
{
    public  static void main(String args[])
    {

        /*Scanner scan =new Scanner(System.in);
        String num;
        System.out.println("Enter a Number");
        num=scan.nextLine();

        if(num.matches("[01]"))
        {
            System.out.println("Binary Radix=2");
        }
        
        else if(num.matches("[0-9]+"))
        {
            System.out.println("Octal Radix=10");
        }

        else if(num.matches("[0-9A-F]+"))

        {
            System.out.println("Hexa Radix=16");
        }*/



//leap year

        Scanner scan=new Scanner((System.in));


        System.out.println("Enter a year: ");
        int year=scan.nextInt();
        if(year%4==0)
        {
             if (year%100==0)
             {
                 if(year%400==0)
                 {
                   System.out.println("Its aleap year.");
                 }
            else
                {
                System.out.println("Its  not a leap year.");
                } 
        }   
        else      
        {
            System.out.println("its a leap year.");
        }   
         

        }

    }

}
        
        
        
        
        
        
        
        
        
        
        
        
        
        


       
       

