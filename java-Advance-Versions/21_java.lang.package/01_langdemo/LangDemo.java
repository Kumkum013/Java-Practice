

import java.lang.*;


class MyObject
{
    public String toString()
    {
        return "My Object";
    }
    
    public int hashCode()
    {
        return 100;
    }
   public boolean equals(Object o)
   {
        return this.hashCode()==o.hashCode();
    }
//    public void notify()
//    {
//        System.out.println("Custom notify method"); 
//     }
 }

public class LangDemo 
{
    public static void main(String[] args) 
    {
        Object o1=new Object();
        //Object o2=new Object();
        Object o2=o1;
        
        System.out.println(o1.equals(o2));

        System.out.println(o1.hashCode());
    }    
}