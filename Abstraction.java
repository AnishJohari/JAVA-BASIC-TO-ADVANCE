// Demonstration of Abstraction in Java

// Abstract class with one abstract method and one concrete method
abstract class Demo {
    // Abstract method - no body
    abstract void display();

    // Concrete method
    void show() {
        System.out.println("show abstraction...");
    }
}

// Concrete class that implements the abstract method
class Abstractexample extends Demo {
    void display() {
        System.out.println("abstraction method...");
    }
}

// Main class to test abstraction
public class Abstraction {
    public static void main(String[] args) {
        Abstractexample obj = new Abstractexample();
        obj.display();
        obj.show();
    }
}
