// AccessSpecifiersDemo.java
class Demo {
    public int pubVar = 10;
    private int priVar = 20;
    protected int proVar = 30;
    int defVar = 40; // default access

    public void show() {
        System.out.println("Public: " + pubVar);
        System.out.println("Private: " + priVar);
        System.out.println("Protected: " + proVar);
        System.out.println("Default: " + defVar);
    }
}

public class AccessSpecifiersDemo {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show(); // accessing all inside class
        System.out.println("Public outside class: " + d.pubVar);
        // System.out.println(d.priVar); // ERROR: private
        System.out.println("Protected: " + d.proVar);
        System.out.println("Default: " + d.defVar);
    }
}

