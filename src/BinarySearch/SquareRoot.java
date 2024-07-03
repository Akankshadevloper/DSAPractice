package BinarySearch;

public class SquareRoot {
    // A Java program to find floor(sqrt(x))

        // Returns floor of square root of x
        static int floorSqrt(int x)
        {
            // Base cases
            if (x == 0 || x == 1)
                return x;

            // Starting from 1, try all numbers until
            // i*i is greater than or equal to x.
            int i = 1, result = 1;

            while (result <= x) {
                i++;
                result = i * i;
            }
            return i - 1;
        }

        // Driver program
        public static void main(String[] args)
        {
            int x = 11;
            System.out.print(floorSqrt(x));
        }
    }

// This code is contributed by Smitha Dinesh Semwal.


