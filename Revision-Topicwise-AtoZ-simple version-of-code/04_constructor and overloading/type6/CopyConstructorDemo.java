
// CopyConstructorDemo.java
class Book {
    String title;
    double price;

    // Parameterized constructor
    Book(String t, double p) {
        title = t;
        price = p;
    }

    // Copy constructor
    Book(Book b) {
        this.title = b.title;
        this.price = b.price;
    }

    void display() {
        System.out.println("Title: " + title + ", Price: " + price);
    }
}

public class CopyConstructorDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", 299.99);
        Book b2 = new Book(b1);  // copy data from b1

        b1.display();
        b2.display();
    }
}
