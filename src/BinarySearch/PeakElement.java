package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class PeakElement {

        public static List<Integer> findPeakGrid(int[][] arr)
        {
            List<Integer> result = new ArrayList<>();
            int row = arr.length;
            int column = arr[0].length;

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    // checking with top element
                    if (i > 0)
                        if (arr[i][j] < arr[i - 1][j])
                            continue;
                    // checking with right element
                    if (j < column - 1)
                        if (arr[i][j] < arr[i][j + 1])
                            continue;
                    // checking with bottom element
                    if (i < row - 1)
                        if (arr[i][j] < arr[i + 1][j])
                            continue;
                    // checking with left element
                    if (j > 0)
                        if (arr[i][j] < arr[i][j - 1])
                            continue;

                    result.add(i);
                    result.add(j);
                    break;
                }
            }
            return result;
        }

        public static void main(String[] args)
        {
            int[][] arr = { { 9, 8 }, { 2, 6 } };
            List<Integer> result = findPeakGrid(arr);
            System.out.println("Peak element found at index: "
                    + result.get(0) + ", "
                    + result.get(1));
        }
    }


