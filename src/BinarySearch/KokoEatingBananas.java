package BinarySearch;

import java.util.Arrays;

public class KokoEatingBananas {
    // Java implementation for the above approach
        static boolean check(int[] bananas, int mid_val, int H)
        {
            int time = 0;
            for (int i = 0; i < bananas.length; i++) {

                // to get the ceil value
                if (bananas[i] % mid_val != 0) {

                    // in case of odd number
                    time += ((bananas[i] / mid_val) + 1);
                }
                else {

                    // in case of even number
                    time += (bananas[i] / mid_val);
                }
            }

            // check if time is less than
            // or equals to given hour
            if (time <= H) {
                return true;
            }
            else {
                return false;
            }
        }

        static int minEatingSpeed(int []piles, int H)
        {

            // as minimum speed of eating must be 1
            int start = 1;

            // Maximum speed of eating
            // is the maximum bananas in given piles
            int end = Arrays.stream(piles).max().getAsInt();

            while (start < end) {
                int mid = start + (end - start) / 2;

                // Check if the mid(hours) is valid
                if ((check(piles, mid, H)) == true) {

                    // If valid continue to search
                    // lower speed
                    end = mid;
                }
                else {
                    // If cant finish bananas in given
                    // hours, then increase the speed
                    start = mid + 1;
                }
            }
            return end;
        }

        // Driver code
        public static void main(String[] args)
        {
            int []piles = { 30, 11, 23, 4, 20 };
            int H = 6;
            System.out.print(minEatingSpeed(piles, H));
        }
    }

// This code is contributed by 29AjayKumar


