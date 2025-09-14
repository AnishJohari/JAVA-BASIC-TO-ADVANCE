import java.util.Scanner;
public class patterns {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER THE LIMIT : ");
        int n=input.nextInt();
        input.close();

        // System.out.println("NXN MATRIX...");
        // for (int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //     System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // System.out.println("RIGHT ANGLE TRIANGLE");
        // for (int i=0;i<n;i++){
        //     for(int j=0;j<=i;j++){
        //     System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // System.out.println("INVERSE RIGHT ANGLE TRIANGLE");
        // for (int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //     System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // //inverse right side right angled triangle
        // System.out.println("INVERSE RIGHT SIDE RIGHT ANGLED TRIANGLE...");
        // for (int i=0;i<n;i++){
        //     for(int j=0;j<=i;j++){
        //     System.out.print("  ");
        //     }
        //     for(int j=i;j<n;j++){
        //         System.out.print("O ");
        //     }
        //     System.out.println();
        // }

        // //RIGHT SIDE RIGHT ANGLED TRIANGLE
        // System.out.println("RIGHT SIDE RIGHT ANGLED TRIANGLE");
        // for (int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //     System.out.print("  ");
        //     }
        //     for(int j=0;j<=i;j++){
        //         System.out.print("O ");
        //     }
        //     System.out.println();
        // }

        //MAKING A RIGHT SIDE FACING PYRAMID
        // for(int i=0;i<n;i++){
        //     for (int j=0;j<=i;j++){
        //         System.out.print("* ");
        //     }System.out.println();
        // }

        //MAKING AN ARROW
        System.out.println("PRINTING AN ARROW...");
        for (int i=0;i<n;i++){
            System.out.println("* ");
        }
        for (int i=0;i<n+2;i++){
            System.out.print("* ");
        }
        //UPPER RIGHT ANGLE TRIANGLE
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }System.out.println();
        }
        //INVERSE RIGHT ANGLED TRIANGLE
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }System.out.println();

        }
    }
}
