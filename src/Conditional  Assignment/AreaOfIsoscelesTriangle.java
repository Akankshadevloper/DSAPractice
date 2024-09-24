package AssigmentConditionalStatement;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side: ");
        int a = sc.nextInt();
        int area = (int) (0.5 * a * a);
        System.out.println("area of Isosceles is " + area);
    }
}
