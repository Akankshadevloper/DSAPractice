package AssigmentConditionalStatement;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle : " );
        int length  = sc . nextInt();
        System.out.println("Enter the height of the rectangle : ");
        int height = sc.nextInt();
        int areaOfRectangle = length*height;
        System.out.println("area of rectangle : " + areaOfRectangle);
    }
}
