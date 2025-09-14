import java.util.Scanner;
public class loops {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER THE VALUE : ");
        int n=input.nextInt();
        input.close();
        // for(int i=n;i>0;i--){
        //     System.out.print(i+" ");
        // }
        // System.out.println("THIS IS WHULE LOOP...");
        // while(j<=n){
        //     System.out.print(j+" ");
        //     j++;
        // }
        // System.out.println("EVEN NUMBERS...");
        // for (int i=0;i<=n;i=i+2){
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        // System.out.println("ODD NUMBERS...");
        // for (int i=1;i<=n;i=i+2){
        //     System.out.print(i+" ");
        // }
        // int sum=0;
        // for(int i=0;i<=n;i++){
        //     sum+=i;
        // }
        // System.out.println("THE SUM OF N NUMBERS IS : "+sum);
        // int pro=1;
        // for(int i=1;i<=n;i++){
        //     pro*=i;
        // }
        // System.out.println("THE PRODUCT OF N NUMBERS IS : "+pro);
        // int factorial=1;
        // for(int i=1;i<=n;i++){
        //     factorial*=i;
        // }
        // System.out.println("THE FACTORIAL OF N NUMBERS IS : "+factorial);
        // System.out.println("IT IS FOR LOOP...");
        // int fpre=0,flas=1;
        // System.out.print(fpre+" ");
        // System.out.print(flas+" ");
        // for(int i=0;i<=n;i++){
        //     int ans=fpre+flas;
        //     fpre=flas;
        //     flas=ans;
        //     System.out.print(ans+" ");
        // }
        // System.out.println();
        // System.out.println("IT IS WHILE LOOP...");
        // int i=0;
        // while(i<=n){
        //     int ans=fpre+flas;
        //     fpre=flas;
        //     flas=ans;
        //     System.out.print(ans+" ");
        //     i++;
        // }
        // System.out.println("addition by while loop...");
        // int i=0,sum=0;
        // while(i<=n){
        //     sum+=i;
        //     i++;
        // }
        // System.out.println("ADDITION BY WHILE LOOP IS : "+sum);
        // int j=0,fibonachi=1;
        // while(j<=n){
        //     fibonachi*=i;
        //     j++;
        // }
        // System.out.println("THE FIBONACHI SERIES :"+fibonachi);
        

        //DO-WHILE LOOPS
        // int i=1,fact=1;
        // do{
            
        //     fact*=i;
        //     i++;
        // }while(i<=n);
        // System.out.println(fact);
        // System.out.println(i);
        int temp=n;
        int sum=0;
        while(temp/10!=0){
            sum=(sum+temp)*10;
            temp=temp%10;
        }
        System.out.println(sum);
    }  
}
