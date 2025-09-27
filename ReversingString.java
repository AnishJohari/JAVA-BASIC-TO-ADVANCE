import java.util.Scanner;

public class ReversingString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER YOUR SENTENCE: ");
        String str = input.nextLine();
        int len = str.length();
        String reversed = "";

        for (int i = len - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        System.out.println("REVERSED SENTENCE: " + reversed);
        input.close();
    }
}
