// PromotionOverflow.java
public class PromotionOverflow {
    public static void main(String[] args) {
        byte b1 = 50;
        byte b2 = 70;
        // byte sum = b1 + b2; // compile error: b1+b2 promoted to int
        int sumInt = b1 + b2; // OK

        System.out.println("sumInt = " + sumInt);

        int big = Integer.MAX_VALUE;
        System.out.println("Integer.MAX_VALUE = " + big);
        int overflow = big + 1; // overflow wrap-around
        System.out.println("Integer.MAX_VALUE + 1 = " + overflow);
    }
}
