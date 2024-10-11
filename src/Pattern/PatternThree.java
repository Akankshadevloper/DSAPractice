package Pattern;

public class PatternThree {
    public static void main(String[] args) {
        pattern3(4);
    }
    static void pattern3(int n) {
        for (int row = 0; row <= n; row++) {
            //for every row run the col
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            //when one row is printed we need to add a new line
            System.out.println();
        }
    }

}