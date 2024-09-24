package AssigmentConditionalStatement;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pre1 = 0;
        int pre2 = 1;
        int curr = 0;

        for(int i=2; i<=n; i++){
            curr = pre1+pre2;
            pre1=pre2;
            pre2=curr;

        }
        System.out.println(curr);
    }
}
