package AssigmentConditionalStatement;

import java.util.Scanner;

public class UserEnterPrintLargestNumber {
    //Take integer inputs till the user enters 0 and print the largest number from all.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int largestnum = Integer.MIN_VALUE;


//        System.out.print("Enter the number(enter 0 to stop): ");
//
//        while(true){
//            num = sc.nextInt();
//
//            if(num==0){
//                break;
//            }
//            if(num>largestnum){
//                largestnum = num;
//            }
//        }
//
//        if(largestnum==Integer.MIN_VALUE){
//            System.out.println("No number were entered : ");
//        }else{
//            System.out.println("The largest number is : "+largestnum);
//        }
//        sc.close();


        //DO WHILE

        do{
            num = sc.nextInt();
            if(num > largestnum && num != 0){
                largestnum = num;
            }
        }while(num != 0);
        System.out.println(largestnum == Integer.MIN_VALUE ? "No numbers were entered." : "The largest number is: " + largestnum);
        sc.close();

    }
}
