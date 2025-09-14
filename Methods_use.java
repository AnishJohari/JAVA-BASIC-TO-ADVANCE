class calculator{
    int add(int a ,int b){
        return a+b;
    }
    int add(int a, int b,int c, int d ){
        return a+b;
    }
    double add(double a, double b,double c){
        return a + b + c;
    }
}
public class Methods_use{
    public static void main(String args[]){
        calculator cal = new calculator();
        System.out.println(cal.add(5,6));
        System.out.println(cal.add(8.0,9.0,10.0));
    }
}