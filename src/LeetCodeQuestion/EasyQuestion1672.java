package LeetCodeQuestion;

public class EasyQuestion1672 {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts) {
        //person is row and account is col
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            //when u start a new col,take a new sum for that row

            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;

            }
            //now we have sum of accounts of person
            //check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}

