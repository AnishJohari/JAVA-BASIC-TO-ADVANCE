

public class variable {
    public static void main(String[] args){
        int value=10,value2=20;
        System.out.println("before swapping :"+value);
        System.out.println("before swapping : "+value2);
        //swapping two numbers without using third variable

        value=value+value2;
        value2=value-value2;
        value=value-value2;
        
        System.out.println();
        System.out.println("after swapping : "+value);
        System.out.println("after swapping : "+value2);
        int ans=value+value2;
        System.out.println(value+" + "+value2+" = "+value+value2+ " = " +ans);
    }    
}