public class Static_usage extends Static_methods{
    
    // AFTER MAIN STATIC BLOCK IS EXECUTED AND THEN OTHER METOD OR ANYTHING AFTER STATIC IS EXECUTED.
    
    static{
        System.out.println("STATIC BLOCK...");
    }
    
    // WHEN THE OBJECT IS CREATED THEN THIS Static_methods() METHOD WILL GET EXECUTED AFTER STATIC METHOD.

    public static void main(String[] args) {
    
        // Static_methods obj = new Static_methods();

    
        display();

    
    }

}

// now we have static method in class Static_methods now we can call that method
// directly without creating object of that class
class Static_methods{
    Static_methods(){
        
        System.out.println("CONSTRUCTOR PRINT STATEMENT...");
    }
    
    static void display(){
    
        System.out.println("java in static method...");
    
    }
}

