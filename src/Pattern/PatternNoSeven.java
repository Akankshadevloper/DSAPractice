package Pattern;

public class PatternNoSeven {
    public static void main(String[] args) {
        pattern30(5);
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {

            // Loop to print spaces
            for (int space = 0; space < n - row; space++) {
                System.out.print(" "); // Corrected to use print instead of println
            }

            // Loop to print numbers in decreasing order
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }

            // Loop to print numbers in increasing order, starting from 2
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " "); // Added a space for proper formatting
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
