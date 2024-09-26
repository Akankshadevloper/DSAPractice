package Assignment;

import java.util.Scanner;

public class PrintMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        System.out.println("Multiplication table for "+ num + " is : ");
        for(int i=1; i<= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        sc.close();
    }
}
