

public class SumOfElements {
     public static void main(String[]args)
     {
        int B[]={1,2,3,4,5};
         int sum=0;

         
        // for(int i=0;i<B.length;i++)
        for(int x:B)
        {
        //  sum = sum+B[i];
         sum=sum+x;
        }
        System.out.println("sum is"+sum);
    }
}
