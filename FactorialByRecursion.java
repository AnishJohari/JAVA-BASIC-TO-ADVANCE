import java.util.Scanner;

public class FactorialByRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for factorial
        System.out.print("ENTER THE NUMBER FOR FACTORIAL : ");
        int num = input.nextInt();
        System.out.println("Factorial of " + num + " is: " + fact(num));

        // Taking input for Fibonacci series
        System.out.print("ENTER LIMIT FOR FIBONACCI SERIES : ");
        int limit = input.nextInt();
        System.out.println("Fibonacci Series up to " + limit + " terms:");
        for (int i = 0; i < limit; i++) {
            System.out.print(fibo(i) + " ");
        }
        System.out.println();

        // Reversing the Fibonacci input number
        System.out.println("Reversed Fibonacci limit input: " + reverseNumber(limit));

        input.close();
    }

    // Recursive factorial function
    static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    // Recursive Fibonacci function
    static int fibo(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibo(n - 1) + fibo(n - 2);
    }

    // Method to reverse a number
    static int reverseNumber(int number) {
        int rev = 0;
        while (number > 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number = number / 10;
        }
        return rev;
    }
}
