package BinarySearch;

public class ClassicalBs {

        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 4, 5}; // Example array
            int target = 3; // Example target
            System.out.println(binarySearch(nums, target) ? "Yes" : "No");
        }

        public static boolean binarySearch(int[] nums, int target) {
            int low = 0;
            int high = nums.length - 1;

            while (low < high) {
                int mid = (low + high) >> 1;
                if (target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid;
                }
            }

            return nums[low] == target;
        }
    }
