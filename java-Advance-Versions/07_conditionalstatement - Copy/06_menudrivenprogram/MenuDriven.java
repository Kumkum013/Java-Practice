import java.util.Scanner;

public class MenuDriven 
{
   public static void main(String[]args) 
   {
        Scanner sc=new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("===");
        System.out.println("Add");
        System.out.println("Sub");
        System.out.println("Mul");
        System.out.println("Div");

        System.out.println("Enter two numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Enter option in Words:");
        String option=sc.nextLine();
        option=option.toUpperCase();

        switch (option) 
        {
            case "ADD":System.out.println("sum is "+(x+y));

            case "sub":System.out.println("Difference is "+(x-y));
    
            case "mult":System.out.println("sum is "+(x*y)); 
                break;
            
            case "div":System.out.println("sum is "+(x/y));
                break;

            default:System.out.println("Invalid option");
            break;
    
        }

   }   
}
