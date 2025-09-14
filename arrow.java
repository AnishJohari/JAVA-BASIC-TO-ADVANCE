import java.util.Scanner;

public class arrow {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        input.close();
        for(int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
                for(int k=0;k<2*i-1;k++){
                    System.out.print("*");
                }
                System.out.println( );
            }
        }

        // for(int i=0;i<2;i++){
        //     for(int j=0;j<n;j++){
        //         if (j==0 || j==n-3){
        //             System.out.print("*");
        //         }
        //         else if(j==n-2 && i==1){
        //             System.out.print("*");
        //         }else {
        //             System.out.print(" ");
        //         }
        //     }System.out.println();
        // }
        // for(int i=0;i<1;i++){
        //     for(int j=0;j<n;j++){
        //             System.out.print("*");
        //     }System.out.println();
        // }
        // for(int i=0;i<2;i++){
        //     for(int j=0;j<n;j++){
        //         if (j==0 || j==n-2){
        //             System.out.print("*");
        //         }
        //         else if(j==n-1 && i==1){
        //             System.out.print("*");
        //         }else {
        //             System.out.print(" ");
        //         }
        //     }System.out.println();
        // }
    }
}
