package Pattern;

public class PatternFourr {
    public static void main(String[] args) {
        pattern4(4);
    }
    static void pattern4(int n) {
        for (int row = 0; row <= n; row++) {
            //for every row run the col
            for (int col = 1; col <= row; col++) {
                System.out.print( col );
            }
            //when one row is printed we need to add a new line
            System.out.println();
        }
    }

}