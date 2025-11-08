public class regularexpression 

{
    public static void main(String[] args)
    {
//         String str1="b7";
//      only two symbols are required       between the given range then it give will give true value

//         System.out.println( str1.matches("[a-z][0-9]"));

           String str2="b";
           String str3="aaaaaavbbb";
           String str4=" kumkum2317@gmail.com" ;    

           System.out.println( str2.matches("//D")); 

           System.out.println( str3.matches("[a-z]*"));

           System.out.println( str4.matches("\\w*@gmail(.*)"));






    }



}