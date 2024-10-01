import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the temperature in C : ");
        float tempC = sc.nextFloat();
        float tempF = (tempC*9/5)+32;
        System.out.println("The temperature is " + tempF);
    }
}
