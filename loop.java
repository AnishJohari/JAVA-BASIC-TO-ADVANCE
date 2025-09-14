import java.util.Scanner;
public class loop {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER THE LIMIT : ");
        int n=input.nextInt();
        input.close();
    for (int i=0;i<n;i++){
        if (i==3){
            break;
        }
        System.out.println(i);
    }
}
}
