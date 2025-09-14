public class classes  {  
// classes are collection of data member and member methonds.
// data members are the variables inside the class.
// member methods are the functions inside the class.
    public static void main(String[] args) {
        
        int x = 10,y = 9;
        
        maths obj = new maths();
        // this variable are actual variable
        obj.add(x,y);
    
    }

}

class maths{
    // these variables are formal variable
    void sub(int a, int b){
        // system is a base class in i/o package
        // out is a static member of system class
        
        System.out.println(a-b);

    }
    void add(int a, int b){

        System.out.println(a+b);

    }
    void mul(int a , int b){
        System.out.println(a*b);
    }
    void div(int a , int b){
        System.out.println(a/b);
    }
}