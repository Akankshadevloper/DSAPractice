package Pattern;

public class PatternSixx {
    public static void main(String[] args) {
        pattern6(5);

    }
    static void pattern6(int n ){
        for(int row = 0 ; row < 2 * n; row++ ){
            int totalColsInTheRow = row > n ? 2 * n - row : row ;

            int noOfSpaces = n-totalColsInTheRow;
            for(int s = 0; s< noOfSpaces; s++){
                System.out.print(" ");
            }

            for(int col = 0 ; col < totalColsInTheRow ; col++ ){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}