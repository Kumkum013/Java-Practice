//checkedunchecked;

public class CheckUnchecked 
{
    static void fun1()
    {
        System.out.println(10/0);
         System.out.println("number is not divisible by 0");
    }
    static void fun2()
    {
        fun1();
    }
    static void fun3()
    {
        fun2();
    } 
    public static void main(String []args)
    {
        fun3();
    }
}
