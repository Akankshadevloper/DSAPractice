package AssigmentConditionalStatement;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st diagonal : ");
        int d1 = sc.nextInt();
        System.out.println("Enter 2nd diagonal : ");
        int d2 = sc.nextInt();

        int areaofRhombas = d1*d2/2;
        System.out.println("area of rhombus : " + areaofRhombas);
    }
}
