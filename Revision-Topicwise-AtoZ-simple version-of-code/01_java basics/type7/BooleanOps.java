// BooleanOps.java
public class BooleanOps {
    static boolean sideEffect() {
        System.out.println("sideEffect() called");
        return true;
    }

    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;

        // short-circuit AND: second part not evaluated if first is false
        System.out.println("Using &&:");
        if (a && sideEffect()) {
            System.out.println("Inside && branch");
        } else {
            System.out.println("&&: side effect skipped because a is false");
        }

        // non-short-circuit AND (&) evaluates both
        System.out.println("Using &:");
        if (a & sideEffect()) {
            System.out.println("Inside & branch");
        } else {
            System.out.println("&: side effect executed even though a is false");
        }

        // Similarly for || vs |
        System.out.println("Using || (short-circuit):");
        if (b || sideEffect()) {
            System.out.println("|| short-circuit: sideEffect not called because b is true");
        }
    }
}
