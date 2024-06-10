package ArrayAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*

         1 2 3
         4 5 6
         7 8 9

        */

//        int[][] arr = new int[3][];

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        //input
        int [][] arr2d = new int[3][3];
        System.out.println(arr2d.length);

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
               arr2d[row][col] = sc.nextInt();
            }
        }
        //output
        for(int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr2d[row]));
        }

    }
}
