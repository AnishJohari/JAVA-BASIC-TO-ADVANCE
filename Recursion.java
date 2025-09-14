public class Recursion {
    int add(int a, int b){
        return a+b;
    }
    static int multyply(int a,int b)
    {
        return a*b;
    }
    int factorial(int n){
        if(n==1){
            return 1;   
        }
        return n*factorial(n-1);
//   5 *4!  
       // 5!= 5*4*3*2*1 =120 
    }
    public static void main(){
        Recursion rec=new Recursion();
        //System.out.println(rec.add(2,4));

        //System.out.println(recursion.multyply(5, 06));
        System.out.println(rec.factorial(5));

    }
}
     