
import java.util.Scanner;
import java.util.Arrays;
public class Use_ARRAYS {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i=0;i<5;i++){
            arr[i]=input.nextInt();
        }
        System.out.print("BEFORE SORTING THE ARRAY WAS : ");
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //sorting using sort method which is in Arrays class
        Arrays.sort(arr);
        //it will print length
        System.out.print(arr.length);
        System.out.print("AFTER SORTING ARRAY IS : ");
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }

        input.close();
    }
    
}
