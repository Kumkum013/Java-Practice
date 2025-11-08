import java.util.Scanner;

public class Factorial
 {
public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");

        int n=sc.nextInt();
        // int sum=0;
        long fact=1;
        for(int i=1; i<=10; i++ )
        {
            // sum=sum+i;
            // System.out.println(n+"x"+i+"="+n*i);

            fact=fact*i;  
        }
        System.out.println("factorial of Number is "+fact);  
             
    }
}
