// RoundingVsTruncation.java
public class RoundingVsTruncation {
    public static void main(String[] args) {
        double val = 9.7;
        int trunc = (int) val;               // truncation => 9
        int rounded = (int) Math.round(val); // rounded => 10
        System.out.println("trunc = " + trunc + ", rounded = " + rounded);
    }
}
