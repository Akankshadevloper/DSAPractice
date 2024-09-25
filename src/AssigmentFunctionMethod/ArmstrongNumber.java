package Assignment;

import java.util.Scanner;

//An Armstrong number (also known as a narcissistic number or pluperfect digital invariant) is a number that is equal to the sum of
// its own digits each raised to the power of the number of digits.



public class ArmstrongNumber {
    //To find Armstrong Number between two given number.
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the lower bound: ");
            int lowerBound = scanner.nextInt();
            System.out.print("Enter the upper bound: ");
            int upperBound = scanner.nextInt();
            scanner.close();

            System.out.println("Armstrong numbers between " + lowerBound + " and " + upperBound + ":");

            for (int num = lowerBound; num <= upperBound; num++) {
                int originalNumber = num;
                int numberOfDigits = String.valueOf(num).length();
                int sum = 0;

                int temp = num;
                while (temp > 0) {
                    int digit = temp % 10;

                    sum += (int) Math.pow(digit, numberOfDigits);
                    temp /= 10;
                }

                if (sum == originalNumber) {
                    System.out.println(originalNumber);
                }
            }
        }
}

