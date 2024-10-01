import java.util.Scanner;

public class SalaryIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int salary = sc.nextInt();

        if(salary >= 10000) {
            salary += 3000;

        } else if(salary >= 5000){
            salary += 2000;
        }else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}
