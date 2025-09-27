public class interface_ex implements class_2,B{
    public void show(){
        System.out.println("DISPLAY METHOD FROM MAIN BODY...");
    }
    public static void main(String[] args) {
        interface_ex obj = new interface_ex();
        obj.show();
        obj.display();
        class_2.print();
        B.print();
    }
}
interface B {
    static void print(){
        System.out.println("INTERFACE 2 METHODS");
    }
    
}

// this time we used interface

interface class_2{
    int a = 0; //final
    public void show();
    default void display(){
        System.out.println("DEFAULT METHOD ");
    }
    static void print(){
        System.out.println("STATIC METHOD " );
    }

}