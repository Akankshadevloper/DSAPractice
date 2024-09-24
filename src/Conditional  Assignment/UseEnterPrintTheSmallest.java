package AssigmentConditionalStatement;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the smallest number from all.
public class UseEnterPrintTheSmallest {
    public static void main(String[] args) {

//          DO WHILE LOOP

        Scanner sc = new Scanner(System.in);
        int num , smallestNum = Integer.MAX_VALUE;

//        do{
//            num = sc.nextInt();
//            if(num < smallestNum && num != 0){
//                smallestNum = num;
//            }
//        }while(num != 0);
//        System.out.println(smallestNum);




        //WHILE LOOP

        System.out.print("Enter number: ");

        while(true){
            num = sc.nextInt();

            if(num == 0){
                break;
            }
            if(num < smallestNum){
                smallestNum = num;
            }
        }

        if(smallestNum == Integer.MAX_VALUE){
            System.out.println("No smallest number");
        }else{
            System.out.println("The smallest number is : "+ smallestNum);
        }

        sc.close();
    }
}
