package AssigmentConditionalStatement;

import java.util.Scanner;

public class FactorsOfThatNumber {
    //Input a number and print all the factors of that number (use loops).
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:  " );

        int number = sc.nextInt();

        sc.close();

        System.out.println("Factors of "+ number + " are: ");

        for(int i = 1; i<=number; i++){
            if(number%i==0){
                System.out.println(i);
            }
        }

    }
}
