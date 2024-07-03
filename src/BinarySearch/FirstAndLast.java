package BinarySearch;

public class FirstAndLast {
    // Java program to find first and last occurrence of
// an elements in given sorted array

        // Function for finding first and last occurrence
        // of an elements
        public static void findFirstAndLast(int arr[], int x)
        {
            int n = arr.length;
            int first = -1, last = -1;
            for (int i = 0; i < n; i++) {
                if (x != arr[i])
                    continue;
                if (first == -1)
                    first = i;
                last = i;
            }
            if (first != -1) {
                System.out.println("First Occurrence = "
                        + first);
                System.out.println("Last Occurrence = " + last);
            }
            else
                System.out.println("Not Found");
        }

        public static void main(String[] args)
        {
            int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
            int x = 8;
            findFirstAndLast(arr, x);
        }
    }

// This code is contributed by Aditya Kumar (adityakumar129)


