import java.lang.*;
import java.util.*;

/*public class areaoftriangle
{   
        public static void main(String arg[])
        {
                float base,height,area;

                System.out.println("Enter the Base and Height");

                Scanner sc=new Scanner(System.in);
                base=sc.nextFloat();
                height=sc.nextFloat();

                area=base*height/2;

                System.out.println("Area of a triangle is "+area);
        }
    
}*/

// method2 
public class areaoftriangle
{   
        public static void main(String arg[])
        {
                int a,b,c;
                float s ;                                       
                double area;

                System.out.println("Enter the three side of triangle");

                Scanner sc=new Scanner(System.in);
                a=sc.nextInt();
                b=sc.nextInt();
                c=sc.nextInt();

                s=(a+b+c)/2f;
                area= Math.sqrt ( s*(s-a)*(s-b)*(s-c));

                
                System.out.println("Area of a triangle is "+area);
        }
    
}
