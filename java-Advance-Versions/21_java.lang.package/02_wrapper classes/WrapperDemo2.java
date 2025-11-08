import javax.print.attribute.IntegerSyntax;

public class WrapperDemo2 {

    public static void main(String[] args) {
        
        Integer i=10;

        Integer a=Integer.valueOf(10);

        Integer b=10;

        Byte c=Byte.valueOf((byte)15); // if you want a primitive
        
        Byte d =Byte.valueOf((byte)15); // if you want a primitive
        
        
        Short f=Short.valueOf("123");
        
        Float g=12.3f;

        Float h=Float.valueOf("123.5");
        
        Double j=Double.valueOf(123.456);
        
        Character k=Character.valueOf('A');
        
        Boolean l=Boolean.valueOf("true");
        
        byte bb=15;
        Byte e=Byte.valueOf(bb);
        
        
        float x=h.floatValue();
        float y=h;
        
        int m=10;
        //Integer n=Integer.valueOf(m);
        Integer n=m;
        //int p=n.intValue();
        int p=n;
        System.out.println("Function call successfully");
    }
    
}
