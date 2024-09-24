package AssigmentConditionalStatement;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base : ");
        int base = sc.nextInt();
        System.out.println("Enter the Height : ");
        int height = sc.nextInt();

        int area = base*height;
        System.out.println("Area of parallelogram : " + area );
    }
}
