import java.util.Scanner;
public class fibonachi_series {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE LIMIT OF THE FIBONNACHI SERIES : ");
        int n = input.nextInt();
        input.close();
        int a=0,b=1;
        System.out.print(a+" ");
        for(int i=0;i<=n;i++){
            int temp=a+b;
            System.out.print(temp+" ");
            a=b;
            b=temp;
        }
    }
}
