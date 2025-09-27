public class new_file {
    public static void main(String[] args) {
       sumtwo a = new sumtwo(1,9);
       sumtwo b = new sumtwo(1.2,8.9);
       System.out.println(a+" "+b);
    }
}

class sumtwo{
    // it is constructor which is called when object is created
    sumtwo(int a,int b){
        System.out.println(a+b);
    }
    // it is constructor which is called when object is created
    sumtwo(double a,double b){
        System.out.println(a+b);
    }
}