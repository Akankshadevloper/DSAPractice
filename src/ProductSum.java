import java.util.Scanner;

public class ProductSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number :   ");
        int n = sc.nextInt();

        // Variables to store the sum and product of the digits
        int sum = 0;
        int product = 1;

        // Temporary variable to hold the input number for calculation
        int temp = n;

        // Loop through each digit of the number
        while (temp > 0) {
            int digit = temp % 10; // Extract the last digit
            sum += digit;          // Add the digit to the sum
            product *= digit;      // Multiply the digit to the product
            temp /= 10;            // Remove the last digit
        }

        // Calculate the difference between the product and the sum
        int result = product - sum;

        // Print the result
        System.out.println("The difference between the product and the sum of the digits of " + n + " is: " + result);

        // Close the scanner
        sc.close();
    }
}
