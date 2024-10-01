import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        // Handle edge cases for n = 0 and n = 1
        if (n == 0) {
            System.out.println(0);
            return;
        }
        if (n == 1) {
            System.out.println(1);
            return;
        }

        int pev = 0; // Represents F(0)
        int init = 1; // Represents F(1)
        int count = 2; // Start from the 2nd position

        while (count <= n) {
            int temp = init; // Save the current Fibonacci number
            init = init + pev; // Compute the next Fibonacci number
            pev = temp; // Update previous Fibonacci number
            count++; // Move to the next position
        }

        System.out.println(init); // Output the nth Fibonacci number
    }
}
