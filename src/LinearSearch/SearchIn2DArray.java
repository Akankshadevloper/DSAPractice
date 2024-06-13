package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 20, 3},
                {47, 52, 69, 7 },
                {70, 88, 92, 34 , 56 },
                {18, 12 }
        };
        int target = 34;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target) {
        for(int row =0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }


}
