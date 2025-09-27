import java.util.Arrays;
import java.util.Scanner;
public class binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE LIMIT OF THE ARRAY : ");
        int length = input.nextInt();
        int [] arr = new int[length];
        for (int i = 0;i<length;i++){
            System.out.print("ENTER A VALUE: ");
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        input.close();

        
        // // if array is sorted then we can use binary search
        // // binary search is faster than linear search

        // // linear search
        // int target = 3;
        // int count = 0;
        // int[] arr = {1,3,2,5,3,9};  

  
        // // for (int i = 0;i<arr.length;i++){
        // //     if(target == arr[i]){
        // //         System.out.println("POSITION IS : "+ (i+1));
        // //         count++;
                

        // //     }
        // // }
        // // System.out.println("TOTAL COUNT IS : "+ count);


        // // binary search
        // Arrays.sort(arr);
        // int start = 0;
        // int end = arr.length - 1;
        // while(start<=end){
        //     int mid=(start+end)/2;
        //     if (arr[mid]==target){
        //         System.out.println("position :"+ (mid+1));
        //         return;
        //     }
        //     else if(target<arr[mid]){
        //         end=mid-1;

        //     }
        //     else{
        //         start = mid+1;
        //     }
        // }
    
    }
}
