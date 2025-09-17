public class polimorphism {
    public static void main(String[] args) {
        poly obj = new poly();
        obj.sum(2,3);
        obj.sum(2,3,4);

    }
}

// POLIMORPHIZM ARE OF TWO TYPES 
// METHOD OVERLOADING
// METHOD OVERRIDING
/*
 * METHOD OVERLEADING IS WE CAN HAVE MULTIPLE METHODS OF SAME NAME WITH DIFFERENT PARAMETERS AND IT WORKS IN RUNTIME POLYMORFIZM
 * 
 * METHOD OVERRIDING IS WHEN WE CREATE 2 CLASS CLASS A AND CLASS B AND INHERIT A IN B BY 'CLASS B EXTENDS A'
 */
class poly{
    void sum(int i , int j){
        System.out.print("the output is : ");
        System.out.println(i+j);
    }
    void sum(int i,int j,int k){
        System.out.print("the output is : ");
        System.out.println(i+j+k);
    }
}