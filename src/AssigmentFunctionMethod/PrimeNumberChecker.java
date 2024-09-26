package Assignment;

import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        boolean flag = false;

        // 0 and 1 are not prime numbers
        if (num == 0 || num == 1) {
            flag = true;
        }

        // Check for factors from 2 up to num / 2
        for (int i = 2; i <= num / 2; ++i) {
            // Condition for non-prime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        // Display the result
        if (!flag) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        // Close the scanner
        scanner.close();
    }
}
