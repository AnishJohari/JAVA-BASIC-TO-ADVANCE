public class string_builder_use {
    public static void main(String args[]){
        // it is not synchronized version
        // capacity() ,subsequence() ,reverse() ,trimToSize() , 
        StringBuilder s= new StringBuilder("hello world");

        System.out.println("THE SUBSEQUENCE IS : "+s.subSequence(0,9));
        int length=s.length();
        System.out.println("THE LENGTH IS : "+length);
        // length=s.trimToSize();
        // System.out.println("THE TRIMTO SIZE METHOD OUTPUT IS  : "+s.trimToSize());

        System.out.println("THE REVERSED STRING IS : "+s.reverse());

        System.out.println("THE CAPACITY OF THE STRING IS : "+s.capacity());


    
    }
}
