package BinarySearch;

public class CowsAssignStall {
    // Java code to implement the approach

        // Driver code
        public static void main(String[] args)
        {
            int K = 3;
            int[] arr = { 1, 2, 4, 8, 9 };
            int N = arr.length;

            // Function call
            System.out.println(aggressive_cows(arr, N, K));
        }

        // Function to check whether a distance is
        // keeping all the cows in the barn
        public static boolean ok(int[] v, int x, int c)
        {
            int n = v.length;
            int count = 1;
            int d = v[0];
            for (int i = 1; i < n; i++) {
                if (v[i] - d >= x) {
                    d = v[i];
                    count++;
                }
                else {
                    continue;
                }
            }
            if (count >= c) {
                return true;
            }
            return false;
        }

        // Function to find the maximum possible
        // minimum distance between two cows
        public static int aggressive_cows(int[] v, int n, int k)
        {
            long ans = -1;
            int maxi = 0;
            for (int i = 0; i < n; i++) {
                maxi = Math.max(maxi, v[i]);
            }

            // Loop from 1 to max limit of the
            // barn length (here = 10^9)
            for (long i = 1; i <= maxi; i++) {
                if (ok(v, (int)i, k)) {
                    ans = i;
                }
                else
                    break;
            }
            return (int)ans;
        }
    }

// This code is contributed by Tapesh(tapeshdua420)


