package AssigmentConditionalStatement;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        int height = sc.nextInt();

        double valueOfPi =  3.14;

        int areaOfCylinder = (int) (2*valueOfPi*radius*height);
        System.out.println("The area of Cylinder : " + areaOfCylinder);
    }
}
