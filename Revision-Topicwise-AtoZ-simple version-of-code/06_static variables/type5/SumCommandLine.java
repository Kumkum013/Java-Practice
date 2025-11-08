// SumCommandLine.java
public class SumCommandLine {
    public static void main(String[] args) {
        int sum = 0;
        for (String a : args)
            sum += Integer.parseInt(a); // convert String to int
        System.out.println("Sum = " + sum);
    }
}

