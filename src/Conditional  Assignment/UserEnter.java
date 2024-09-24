package AssigmentConditionalStatement;

import java.util.Scanner;

public class UserEnter {
    //Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //WHILE LOOP
        int num, sum=0;
        System.out.print("Enter numbers(enter o to stop : ");

        while(true){
            num = sc.nextInt();
            if(num == 0){
                break;
            }
            sum = sum + num;
            continue;

        }
        System.out.println("The sum of all number is : " + sum);
        sc.close();





        //DO-WHILE LOOP
//        int num , sum = 0;
//        System.out.println("Enter number (enter 0 to stop): ");
//
//        do{
//            num = sc.nextInt();
//            sum = sum + num;
//        }while(num != 0);
//        System.out.println("The sum of the numbers is: " + sum);
//        sc.close();






        //For loop
//        int sum = 0;
//        boolean keepgoing = true ;
//
//        System.out.println("Enter number (enter 0 to stop): ");
//
//        for(; keepgoing ; ) {
//            int num = sc.nextInt();
//
//            if(num == 0) {
//                keepgoing = false;
//            }else{
//                sum += num;
//            }
//        }
//        System.out.println("The sum of the number is : " + sum );


    }
}
