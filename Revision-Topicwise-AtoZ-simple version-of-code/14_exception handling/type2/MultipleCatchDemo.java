public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int c = a / b; // ArithmeticException
            int arr[] = new int[5];
            arr[10] = 50; // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds");
        } catch (Exception e) {
            System.out.println("Some other exception occurred");
        }
    }
}
