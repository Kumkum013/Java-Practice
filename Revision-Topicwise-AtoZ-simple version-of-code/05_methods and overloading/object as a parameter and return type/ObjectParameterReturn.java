// ObjectParameterReturn.java
class Number {
    int value;

    // constructor to set value
    Number(int v) {
        value = v;
    }
}

public class ObjectParameterReturn {

    // method that takes object as parameter and returns a new object
    Number add(Number n1, Number n2) {
        int sum = n1.value + n2.value;
        return new Number(sum);  // returning object
    }

    public static void main(String[] args) {
        ObjectParameterReturn obj = new ObjectParameterReturn();

        Number num1 = new Number(5);
        Number num2 = new Number(10);

        Number result = obj.add(num1, num2);  // passing objects

        System.out.println("Sum = " + result.value);
    }
}

