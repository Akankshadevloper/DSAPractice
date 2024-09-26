package Assignment;

import java.util.Scanner;

public class TwoNumbers {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user for the first number
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            // Prompt the user for the second number
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Prompt the user for the operator
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            double result;

            // Perform the calculation based on the operator
            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    scanner.close();
                    return;
                }
            } else {
                System.out.println("Error: Invalid operator");
                scanner.close();
                return;
            }

            // Print the result
            System.out.println("The result is: " + result);

            // Close the scanner
            scanner.close();
        }
    }
