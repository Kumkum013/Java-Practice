import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Length of strings
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Length of str2: " + str2.length());

        // Concatenation
        String concatStr = str1.concat(str2);
        System.out.println("Concatenated string: " + concatStr);

        // Substring
        System.out.println("Substring of str1 (0-3): " + str1.substring(0, 3));

        // String comparison
        if (str1.equals(str2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // Convert to uppercase/lowercase
        System.out.println("str1 in uppercase: " + str1.toUpperCase());
        System.out.println("str2 in lowercase: " + str2.toLowerCase());

        sc.close();
    }
}

