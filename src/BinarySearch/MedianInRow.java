package BinarySearch;

import java.util.Arrays;

public class MedianInRow {
    // Java program to find median of a matrix
// sorted row wise
        // function to find median in the matrix
        static int binaryMedian(int m[][], int r, int c) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < r; i++) {
                // Finding the minimum element
                if (m[i][0] < min)
                    min = m[i][0];

                // Finding the maximum element
                if (m[i] > max)
                    max = m[i];
            }

            int desired = (r * c + 1) / 2;
            while (min < max) {
                int mid = min + (max - min) / 2;
                int place = 0;
                int get = 0;

                // Find count of elements smaller than or equal
                // to mid
                for (int i = 0; i < r; ++i) {
                    get = Arrays.binarySearch(m[i], mid);

                    // If element is not found in the array the
                    // binarySearch() method returns
                    // (-(insertion_point) - 1). So once we know
                    // the insertion point we can find elements
                    // Smaller than the searched element by the
                    // following calculation
                    if (get < 0)
                        get = Math.abs(get) - 1;

                        // If element is found in the array it
                        // returns the index(any index in case of
                        // duplicate). So we go to last index of
                        // element which will give the number of
                        // elements smaller than the number
                        // including the searched element.
                    else {
                        while (get < c && m[i][get] == mid)
                            get += 1;
                    }

                    place = place + get;
                }

                if (place < desired)
                    min = mid + 1;
                else
                    max = mid;
            }
            return min;
        }

        // Driver Program to test above method.
        public static void main(String[] args) {
            int r = 3, c = 3;
            int m[][] = { { 1, 3, 5 }, { 2, 6, 9 }, { 3, 6, 9 } };

            System.out.println("Median is " + binaryMedian(m, r, c));
        }
    }


