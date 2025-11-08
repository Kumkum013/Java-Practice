import java.util.Scanner;


public class StudentChallenge 
{
    public static void main(String args[])
 {

        /*int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();

        if(n%2==0)
        {
            System.out.println("It is a even Number");
        }

        else
        {
            System.out.println("It is a odd number");
        }*/


    /*// find a person is young or not
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("enteryour age");
        age=sc.nextInt();
        if(age>=14 && age<=55 )
        {
            System.out.println("It isa  young person");
        }
        else
        {
            System.out.println("It isa  not ayoung person");
        }*/



    // find gradesfor different marks
        int m1,m2,m3;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter marks of three subject: ");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();

        float avg=(float)(m1+m2+m3)/3;

        if (avg>=70)
        {
            System.out.println("Grade A");
        }
        else if (avg>=60 && avg<70)
        {
            System.out.println("Grade B");
        }
        else if (avg>=50 && avg<60)
        {
            System.out.println("Grade C");
        }


    }    
}
