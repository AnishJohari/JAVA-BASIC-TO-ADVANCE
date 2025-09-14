public class classes_and_objects {      


/*
* overleading:-compiler check signature to allow multiple methods with same name but with different parameter list
* overriding:-method in child class must have the same signature as parent class
* polymorphism:-method call binding/joining  is based on signature (at compile time on overloading , at runtime for overriding).
*/
        
    // it is a class 
    public  static class math_function{
        // it a method inside class

        // Signature: sum(int , int)
        int sum(int a,int b){
            return a+b;
        }
        // it is a method inside class

        // Signature: sub(int , int)
        int sub(int a , int b){
            return a-b;
        }
    }
    
    // static int add(int a,int b){
    //     return a+b ;


    public static void main(String args[]){
    //    here we are creating an object
        math_function s= new math_function();
       
        System.out.println(s.sub(10,5));
       
        System.out.println(s.sum(5,5));
    
        
    }

}   
