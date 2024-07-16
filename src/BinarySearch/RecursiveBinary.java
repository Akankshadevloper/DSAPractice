package BinarySearch;

public class RecursiveBinary {

        public static void main(String[] args) {
            int X = 101; // The number for which we want to find the square root
            int lo = 0; // Initialize the lower bound of the search range
            int hi = X; // Initialize the upper bound of the search range
            int answer = -1; // Initialize the answer variable

            // Perform binary search to find the square root
            while (lo <= hi) {
                int mid = (lo + hi) / 2; // Calculate the middle value

                // Check if the square of the middle value is less than X
                if (mid * mid < X) {
                    answer = mid; // Update the answer to the current middle value
                    lo = mid + 1; // Update the lower bound for the next iteration
                } else {
                    hi = mid - 1; // Update the upper bound for the next iteration
                }
            }

            System.out.println("Value which satisfies the equation: " + answer);
        }
    }


