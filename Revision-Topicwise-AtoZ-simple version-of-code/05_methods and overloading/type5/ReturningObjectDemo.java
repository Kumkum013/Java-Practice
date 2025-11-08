// ReturningObjectDemo.java
class Complex {
    int real, imag;

    Complex(int r, int i) 
    { 
        real = r;
        imag = i;
    }

    Complex add(Complex c2) {
        Complex temp = new Complex(0, 0);
        temp.real = this.real + c2.real;
        temp.imag = this.imag + c2.imag;
        return temp;  // returning object
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class ReturningObjectDemo {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, 5);
        Complex result = c1.add(c2);

        result.display();
    }
}
