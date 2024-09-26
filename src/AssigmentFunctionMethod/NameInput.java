package Assignment;

import java.util.Scanner;

public class NameInput {
    //Take name as input and print a greeting message for that particular name.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + "Nice to meet you!");
    }
}
