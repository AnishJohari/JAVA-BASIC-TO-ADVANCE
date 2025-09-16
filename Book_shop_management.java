import java.util.Scanner;
public class Book_shop_management{
    public static void main(){
        Scanner input = new Scanner(System.in);
        Book_shop obj = new Book_shop();
        obj.admin(input);
        // obj.customer(input);
    }
}

class Book_shop{
    void admin(Scanner input){

        System.out.println("1. ADD BOOKS. ");
        System.out.println("2. REMOVE BOOKS.");
        System.out.println("3. ACCOUNT BALANCE.");
        System.out.println("4. EXIT.");
        System.out.print("ENTER YOUR CHOICE : ");
        int Choice;
        while (true){
            System.out.print("ENTER YOUR CHOICE : ");
            int temp = input.nextInt();
            if (temp==1 || temp==2 || temp==3){
                Choice = temp;
                break;
            }
            else{
                System.out.println("YOU ENTERED THE INVALID OPTION PLEASE ENTER A VALID OPTION...");
                continue;
            }
        }

        if (Choice == 1){
            System.out.println("1. ADD A BOOK. ");
            System.out.println("2. ADD A WHOLE STACK OF BOOKS.");
            System.out.println("3. EXIT. ");
            int admin_choice;
            while (true){
            System.out.print("ENTER YOUR CHOICE : ");
            int temp = input.nextInt();
            if (temp==1 || temp==2 || temp==3){
                admin_choice = temp;
                break;
            }
            else{
                System.out.println("YOU ENTERED THE INVALID OPTION PLEASE ENTER A VALID OPTION...");
                continue;
            }
            }
            if (admin_choice == 1){

            }
            else if (admin_choice == 2){

            }
            else if (admin_choice == 3){

            }
        }









    }
    void customer(Scanner input){
        System.out.println("1. BUY/RENT A BOOK. ");
        System.out.println("2. RETURN BOOKS.");
        System.out.println("3. PAY THE FINE .");
        System.out.println("4. EXIT.");
    }
}