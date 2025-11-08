import java.util.Scanner;

public class Fibonacci
 {
    public static void main(String[]args)
     {
        Scanner sc=new Scanner (System.in);
        System.out.println("Program to print Fibonacci Series");
        System.out.println("Enter Enter no of terms");
        int n=sc.nextInt();
        int a=0,b=1,c;
        System.out.print(a+","+b+",");

        for(int i=0;i<n-2;i++)
        {
            c=a+b;
            System.out.println(c+",");
            a=b;
            b=c;
        }
     }    
}
