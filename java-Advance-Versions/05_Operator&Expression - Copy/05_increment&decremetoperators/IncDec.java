public class IncDec
{
    public static void main(String arg[])
    {
        int x=5,y=4,z;
        z=2*x++ + 3 * ++y;
        
        System.out.println(z);
    }
}
// note :character(a),float,byte also increment decrement by 1 but boolean is not increment or decrement by 1 