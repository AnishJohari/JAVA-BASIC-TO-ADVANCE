import java.util.Scanner;
public class random_number {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        double random_number=Math.random()*100;
        while (true){
            System.out.println("GUESS YOUR NUMBER : ");
            double user_input=input.nextInt();
            if (user_input==random_number){
                System.out.println("YOU GOT RIGHT.......");
                
            }
            else if(random_number<user_input){
                System.out.println("YOUR GUESS IS TOO HIGH...");
            }
            else if(random_number>user_input){
                System.out.println("YOUR GUESS IS TOO LOW");
            }
            input.close();
        }
        
        
    }
    
}
