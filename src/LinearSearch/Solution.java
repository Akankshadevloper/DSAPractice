package LinearSearch;

public class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {12, 345, 2, 6, 7896}; // Example array
        int result = solution.findNumbers(nums);
        System.out.println("Number of elements with even number of digits: " + result);
    }
}
