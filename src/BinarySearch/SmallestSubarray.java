package BinarySearch;

public class SmallestSubarray {
    // Java Implementation



        // Function to check if there exists a subarray of size mid
        // whose sum is greater than x
        static boolean isSubarrayPresent(int mid, int[] arr, int n, int x) {
            // Variable to store if there is any subarray present or not
            boolean isSubarray = false;
            int i = 0, j = 0, sum = 0;

            // Calculate the sum of the first 'mid' elements
            for (j = 0; j < mid; j++) {
                sum += arr[j];
            }

            // Slide the window of size 'mid' and check if the sum is greater than x or not
            while (j < n) {
                // If sum > x, then there exists a subarray of size mid
                if (sum > x) {
                    isSubarray = true;
                }

                // Adjust the sum by removing the first element and adding the next element
                sum -= arr[i];
                sum += arr[j];
                i++;
                j++;
            }

            // Check one last time if the sum is greater than x
            if (sum > x) {
                isSubarray = true;
            }

            return isSubarray;
        }

        // Function to calculate the smallest subarray size whose
        // sum is less than x
        static int smallestSubarrayWithSum(int[] arr, int n, int x) {
            // Define the search space from low to high and ans to
            // store the minimum subarray size
            int low = 0, high = n, ans = Integer.MAX_VALUE;

            while (low <= high) {
                // Calculate mid
                int mid = (low + high) / 2;

                // Check if there exists a subarray of size mid whose
                // sum is greater than x
                if (isSubarrayPresent(mid, arr, n, x)) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            // Return the minimal length
            return (ans == Integer.MAX_VALUE) ? 0 : ans;
        }

        // Driver code
        public static void main(String[] args) {
            int[] arr = { 1, 4, 45, 6, 0, 19 };
            int n = 6;
            int x = 51;
            System.out.println(smallestSubarrayWithSum(arr, n, x));
        }
    }

// This code is contributed by Tapesh(tapeshdua420)


