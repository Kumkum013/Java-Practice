import java.util.Scanner;

public class Armstrong 
{
    public static void main(String[] args)
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter a number");
          int n=sc.nextInt();
        // int r;
        //   int count=0;
           int m=n;
           int sum=0;
           int r;
           while(n>0)
      {
            r=n%10;
            n=n%10;

            sum=sum+r*r*r;
         //   count++;
              
        } 
        if(sum==m)
            System.out.println("it is a armstrong number");
        else
            System.out.println("it is not a armstrong number");    
}
}
