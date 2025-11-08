

public class SecondLargest 
{
   public static void main(String[]args)
     {
        int B[]={1,2,3,4,5};
        int max1,max2;
         max1 = max2= B[0];
        for(int i=0;i<B.length;i++)
        { 
            if (B[i]>max1)
            {
                max2=max1;
                max1=B[i];
                System.out.println(max1);
            }
            else if(B[i]> max2)
            {
                max2=B[i];

            }  
        }
    
System.out.println("second largest is "+max2);
    }
}
