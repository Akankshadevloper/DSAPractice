package Assignment;

import java.util.Scanner;

public class SumOfDigits {
    //Write a Java program to calculate the sum of digits of a given number.
public static void main(String[] args) {
//    int number = 1234;
//    int sum = 0;
//
//    while(number > 0) {
//        sum = sum + number % 10;
//        number = number / 10;
//    }
//    System.out.println("Sum of digits is: " + sum);

    Scanner sc = new Scanner(System.in);

    //Prompt the user for the number
    System.out.println("Enter a number : ");
    int num = sc.nextInt();

    //Initialize sum
    int sum = 0;

    //Calculate the sum of the digit
    int temp = num;//use a temporary variable to keep the original number

    while (temp > 0) {
        sum = sum + temp % 10;//add the last digit to sum
        temp = temp / 10;//remove the last digit
    }

    System.out.println("The sum of the digits is : " + sum);

    sc.close();
  }
}
