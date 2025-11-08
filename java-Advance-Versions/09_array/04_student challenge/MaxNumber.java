

public class MaxNumber 
{
    public static void main(String[]args)
     {
        int B[]={1,2,3,4,5};
        int max=B[0];
        
        for(int i=0;i<B.length;i++)
        {
            if (B[i]>max)
            {
                max=B[i];
            }
        }
        System.out.println(max);
            
    }
}
