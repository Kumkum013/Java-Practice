class Product {
    private String itemNo;
    private String name;
    private double price;
    private short qty;

    public Product(String itemNo) {
        this.itemNo = itemNo;
    }

    public Product(String itemNo, String name) {
        this.itemNo = itemNo;
        this.name = name;
    }

    public Product(String itemNo, String name, double price, short qty) {
        this.itemNo = itemNo;
        this.name = name;
        setPrice(price);
        setQuantity(qty);
    }

    public String getItemNo() {
        return itemNo;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public short getQuantity() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(short qty) {
        this.qty = qty;
    }
}

class Customer {
    private String custId;
    private String name;
    private String address;
    private String phno;

    public Customer(String custId, String name) {
        this.custId = custId;
        this.name = name; // ✅ fixed
    }

    public Customer(String custId, String name, String address, String phno) {
        this.custId = custId;
        this.name = name; // ✅ fixed
        setAddress(address);
        setPhno(phno);
    }

    public String getCustId() {
        return custId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhno() {
        return phno;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }
}

public class SCoops2 {
    public static void main(String[] args) {
        // Sample product
        Product p1 = new Product("P1001", "Ice Cream", 50.0, (short) 10);
        System.out.println("Product: " + p1.getName() + ", Price: " + p1.getPrice() + ", Quantity: " + p1.getQuantity());

        // Sample customer
        Customer c1 = new Customer("C101", "Kumkum", "Vasai, MH", "9876543210");
        System.out.println("Customer: " + c1.getName() + ", Phone: " + c1.getPhno());
    }
}


    

