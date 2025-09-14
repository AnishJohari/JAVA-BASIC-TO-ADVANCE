public class bitmasking {
    public static void main(String args[]){
        //it is checking a bit

        // int n=20;
        //it will help us get the binary representation of n in positive and negative 
        // for (int i=8;i<0;i++)
        // if ((n & (1<<(i-1)))>0){
        //     System.out.print(1);
        // }
        // else{
        //     System.out.print(0);
        // }

        //it will print binary equivalent of -128 to 127 
    //     for(int n=-128;n<=127;n++){
    //         System.out.print("THE BINARY VALUE OF "+n+" is : ");
    //     for (int i=8;i>0;i--){
    //     if ((n&(1<<(i-1))) > 0){
    //         System.out.print(1);
    //     }
    //     else{
    //         System.out.print(0);
    //     }
    // }System.out.println();}


//it is colled 'setting' a bit as we change the bit if it is 0 we do it as 1 and if it is 1 then it will remain as 1
    int n=20;
    int bi=2;
    System.out.println(n|(1<<(bi-1)));


    //flipping a bit method
    // int n=20;
    bi=3;
    System.out.println(n^(1<<(bi-1)));
    

    // '~' this sign is bitwise 1's compliment
    //clearing a bit-- mean to convert bit  1 to 0 and 0 remain 0
    System.out.println(n & ~ (1<<(bi-1)));
    }
}