import java.util.*;


public class AreaOfCuboidVolume
{   
        public static void main(String arg[])
        {
                int  length,base,height,totalarea,volume;
        
                System.out.println("Enter the length, Base and Height: ");

                Scanner sc=new Scanner(System.in);
                length=sc.nextInt();
                base=sc.nextInt();
                height=sc.nextInt();

                totalarea=2*(length*base+base*height+height*length);
                volume=length*base*height;
                
                System.out.println("total Area of cuboid is "+totalarea);
                System.out.println("volume of cuboid is "+volume);
        }
    
}
