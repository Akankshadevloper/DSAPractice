import java.util.Scanner;

public class ForFibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER ");
        int n = sc.nextInt();
        int prev1 = 0;
        int prev2 = 1;
        int curr =  0;

        for(int i = 2; i <= n; i++) {
            curr = prev1 + prev2;
            prev1 = prev2;
            prev2 = curr;
        }
        System.out.println(curr);
    }
}
