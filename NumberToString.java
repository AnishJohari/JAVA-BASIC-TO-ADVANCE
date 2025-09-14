import java.util.Scanner;

public class NumberToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number between -100 and 100: ");
        int number = sc.nextInt();

        // Check range
        if (number < -100 || number > 100) {
            System.out.println("Number is out of range!");
        } else {
            // Convert number to String
            String strNumber = Integer.toString(number);
            // OR: String strNumber = String.valueOf(number);

            System.out.println("The number as a String: " + strNumber);
        }

        sc.close();
    }
}
