

public class Insertion 
{
   public static void main(String[]args)
     {
        int B[]=new int[10];
        B[0]=3 ;
        B[1]=9 ;
        B[2]=7;
        B[3]=8 ;
        int n=6;
        for(int i=0;i<n;i++)
        System.out.print(B[i]+",");
        System.out.println("");

        int x=20;
        int index=2;

        for(int i=n;i>index;i--)
        B[i]=B[i-1];
        B[index]=x;

        for(int i=0;i<n;i++)
        System.out.print(B[i]+",");
        System.out.println("");
     }

}
