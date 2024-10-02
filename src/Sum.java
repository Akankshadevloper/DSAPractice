import java.util.Scanner;

public class Sum {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int sum = x+y;
        System.out.println("The sum of two number is " + sum);
    }
}
