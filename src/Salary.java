import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int add;

        if(salary >= 20000) {
            System.out.println("Give a bonus of 2000 ");
            add = salary + 2000;
        }else{
            System.out.println("Give a bonus of 1000: " + salary+1000);
            add = salary + 1000;
        }
        System.out.println(add);
    }
}
