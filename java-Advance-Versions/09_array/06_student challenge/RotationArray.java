

public class RotationArray 
{
    public static void main(String[]args)
     {
        int B[]={1,2,3,4,5};
        for (int x:B)

        System.out.println(x+",");
        System.out.println("");

       // int temp= B[0];
       int temp = B[B.length - 1];

       // for(int i=1;i<B.length;i++)
        for (int i = B.length - 1; i > 0; i--)
        {
           // B[i-1]=B[i];
             B[i] = B[i - 1];
            
        }
            // B[B.length-1]=temp;
            B[0] = temp;
             for (int x:B)

        System.out.println(x+",");
        System.out.println("");

}
}
