package Pattern;

public class Pattern17 {
    public static void main(String[] args) {
        pattern17(5);
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {

            int totalColsInRow = row > n ? 2 * n - row : row;

            // Loop to print spaces
            for (int space = 0; space < n - totalColsInRow; space++) {
                System.out.print("  "); // Added extra space for better alignment
            }

            // Loop to print numbers in decreasing order
            for (int col = totalColsInRow; col >= 1; col--) {
                System.out.print(col + " ");
            }

            // Loop to print numbers in increasing order, starting from 2
            for (int col = 2; col <= totalColsInRow; col++) {
                System.out.print(col + " ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
