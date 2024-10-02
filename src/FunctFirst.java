import java.util.Scanner;

public class FunctFirst {
    public static void main(String[] args) {

        sum();
        sum();
    }


    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
    /*
    access modifier
     */
}
