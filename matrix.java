import java.util.*;
public class matrix{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER ROWS : ");
        int rows = input.nextInt();
        System.out.println("ENTER COLUMN : ");
        int column = input.nextInt();
        
        int [][] arr = new int[rows][column];
        for (int i = 0;i<rows;i++){
            for(int j = 0;j<column;j++){
                arr[i][j] =input.nextInt(); 
            }
        }

        System.out.println("ENTER THE ELEMENT YOU WISH TO FIND : ");
        int find = input.nextInt();
        for(int i=0 ; i<rows;i++){
            for(int j = 0; j<column;j++){
                if (arr[i][j]==find){
                    System.out.println("THE POSITION IS :"+j);
                    
                }
            }
        }

        // System.out.println("YOUR MATRIX IS : ");
        
        
        // for (int i = 0;i<rows;i++){
        //     for(int j = 0;j<column;j++){
        //          System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
       input.close();
    }
}