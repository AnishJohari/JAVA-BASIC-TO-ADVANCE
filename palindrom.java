import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {

    int r=0,temp=0;
    Scanner input = new Scanner(System.in);
    System.out.print("ENTER A NUMBER : ");
    int x = input.nextInt();
    input.close();
    if (x<=-10 || x>=10){
        temp = x;
    }
    while(temp!=0){
        int digit = temp%10;
        r=r*10+digit;
        temp=temp/10;
    }
    if (x<0){
        r=-r;
    }
    if (x==r){
        System.out.println("true");
    }
    else{
        System.out.println("false");
        }
    }
}