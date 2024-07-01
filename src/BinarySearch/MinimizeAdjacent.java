package BinarySearch;

public class MinimizeAdjacent {
    // Java program for the above approach

        // Function to check if it is possible
        // to add K points such that the maximum
        // distance between adjacent points is D
        public static boolean isPossible(double D, int arr[],
                                         int N, int K)
        {
            // Stores the count of point used
            int used = 0;

            // Iterate over all given points
            for (int i = 0; i < N - 1; ++i) {

                // Add number of points required
                // to be placed between ith
                // and (i+1)th point
                used += (int) ((arr[i + 1] - arr[i]) / D);
            }

            // Return answer
            return used <= K;
        }

        // Function to find the minimum value of
        // maximum distance between adjacent points
        // after adding K points any where between
        public static double minMaxDist(int stations[], int N, int K)
        {

            // Stores the lower bound and upper
            // bound of the given range
            double low = 0, high = 1e8;

            // Perform binary search
            while (high - low > 1e-6) {

                // Find the middle value
                double mid = (low + high) / 2.0;

                if (isPossible(mid, stations, N, K)) {

                    // Update the current range
                    // to lower half
                    high = mid;
                }

                // Update the current range
                // to upper half
                else {
                    low = mid;
                }
            }

            // System.out.printf("Value: %.2f", low);
            return low;
        }

        // Driver Code
        public static void main(String args[])
        {
            int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            int K = 9;
            int N = arr.length;

            System.out.printf("%.1f", minMaxDist(arr, N, K));
        }
    }

// This code is contributed by _saurabh_jaiswal.


