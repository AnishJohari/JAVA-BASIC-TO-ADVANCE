public class Astraction{
    public static void main(String[] args) {
     Abstractexample obj = new Abstractexample();
        obj.display();
        obj.show();
    }
}
//  we hides all the class abstraction in this way



// when we do not want to give body of the method to others.
// for this we use abstract keyword which contain method body and name 
abstract class Demo{

    abstract void display();
    
    // normal method
    void show()
    {
        System.out.println("show abstraction...");
    }
}

class Abstractexample extends Demo {
    void display(){
        System.out.println("abstraction method...");
    }
}
