

import java.lang.annotation.Annotation;

@interface MyAnno
{
    String name();
    String project();
    String date() default "today";
    String version() default "13";
            }

@MyAnno(name="Ajay",project="Bank")
public class AnnoDemo 
{
   // @MyAnno(name="sanjay")
    int data;
    
   // @MyAnno(name="Ajay")
    public static void main(String[] args) 
    {
       // @MyAnno(name="Ajay")
        int x;
        System.out.println("program run successfully");
    }
    
}
