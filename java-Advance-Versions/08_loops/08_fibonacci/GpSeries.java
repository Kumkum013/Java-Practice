import java.util.Scanner;

public class GpSeries 
{
    public static void main(String[]args)
     {
        Scanner sc=new Scanner (System.in);
        System.out.println("Program to print Gp Series");
        System.out.println("Enter a,r,and n");
        int a=sc.nextInt();
        int n=sc.nextInt();
        int r=sc.nextInt();
        int term=a;

        for (int i=0;i<n;i++)
        {
            System.out.println(term+",");
            term=term*r;
        }
     }  
}
