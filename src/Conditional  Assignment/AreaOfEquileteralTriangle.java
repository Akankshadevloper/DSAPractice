package AssigmentConditionalStatement;

import java.util.Scanner;

public class AreaOfEquileteralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int h = sc.nextInt();
        int fixedvalue = (int) 1.3161;
        int area = (int) (fixedvalue *b*h);
        System.out.println("Area of Equilateral Triangle = "+ area);
    }
}
