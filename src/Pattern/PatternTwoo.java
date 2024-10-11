package Pattern;

public class PatternTwoo {
    public static void main(String[] args) {
        patter2(5);
    }
    static void patter2(int n) {
        for (int row = 0; row <= n; row++) {
            //for every row run the col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            //when one row is printed we need to add a new line
            System.out.println();
        }
    }

}
