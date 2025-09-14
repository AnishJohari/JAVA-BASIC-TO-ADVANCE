import java.util.Scanner;
public class prime_no_checking {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        int find=0;
        for(int i = 2 ;i < n; i++){
            if (n%i==0){
                find++;
            }
        }
        if (find!=0){
            System.out.println("THE NUMBER IS NOT PRIME..");
        }
        else{
            System.out.println("THE NUMBER IS PRIME...");
    }
}
}