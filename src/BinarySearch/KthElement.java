package BinarySearch;

public class KthElement {

        static int kth(int arr1[], int arr2[], int n, int m,
                       int k)
        {
            // array to store the merged sorted array
            int[] sorted1 = new int[m + n];
            int i = 0, j = 0, d = 0;
            while (i < n && j < m) {
                // If the element of arr1 is smaller, insert the
                // element to the sorted array
                if (arr1[i] < arr2[j])
                    sorted1[d++] = arr1[i++];
                else
                    // If the element of arr2 is smaller, insert
                    // the element to the sorted array
                    sorted1[d++] = arr2[j++];
            }
            // Push the remaining elements of arr1
            while (i < n)
                sorted1[d++] = arr1[i++];
            // Push the remaining elements of arr2
            while (j < m)
                sorted1[d++] = arr2[j++];
            // Return the element at kth position in the merged
            // sorted array
            return sorted1[k - 1];
        }

        // Driver Code
        public static void main(String[] args)
        {
            int arr1[] = { 2, 3, 6, 7, 9 };
            int arr2[] = { 1, 4, 8, 10 };
            int k = 5;
            System.out.print(kth(arr1, arr2, 5, 4, k));
        }
    }

    /* This code is contributed by Harsh Agarwal */


