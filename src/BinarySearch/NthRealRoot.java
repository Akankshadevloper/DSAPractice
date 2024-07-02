package BinarySearch;

public class NthRealRoot {
    // Java Program to find n-th real root of x
        static void findNthRoot(double x, int n)
        {

            // Initialize boundary values
            double low, high;
            if (x >= 0 && x <= 1)
            {
                low = x;
                high = 1;
            }
            else
            {
                low = 1;
                high = x;
            }

            // used for taking approximations
            // of the answer
            double epsilon = 0.00000001;

            // Do binary search
            double guess = (low + high) / 2;
            while (Math.abs((Math.pow(guess, n)) - x)
                    >= epsilon)
            {
                if (Math.pow(guess, n) > x)
                {
                    high = guess;
                }
                else
                {
                    low = guess;
                }
                guess = (low + high) / 2;
            }

            System.out.println(guess);
        }

        // Driver code
        public static void main(String[] args)
        {
            double x = 5;
            int n = 2;
            findNthRoot(x, n);
        }
    }

// This code is contributed
// by mits

