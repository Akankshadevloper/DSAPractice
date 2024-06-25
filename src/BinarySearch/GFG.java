package BinarySearch;

public class GFG {
    // Java program for the above approach

        // Function to find insert position of K
        static int find_index(int[] arr, int n, int K)
        {

            // Traverse the array
            for(int i = 0; i < n; i++)

                // If K is found
                if (arr[i] == K)
                    return i;

                    // If current array element
                    // exceeds K
                else if (arr[i] > K)
                    return i;

            // If all elements are smaller
            // than K
            return n;
        }

        // Driver Code
        public static void main(String[] args)
        {
            int[] arr = { 1, 3, 5, 6 };
            int n = arr.length;
            int K = 2;

            System.out.println(find_index(arr, n, K));
        }
    }


