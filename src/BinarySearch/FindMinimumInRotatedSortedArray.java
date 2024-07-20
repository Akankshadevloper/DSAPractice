package BinarySearch;

public class FindMinimumInRotatedSortedArray {

        public static int findMin(int[] nums) {
            int left = 0, right = nums.length - 1;

            while (left < right) {
                int mid = left + (right - left) / 2;

                // If mid element is less than the right element, min must be in the left part
                if (nums[mid] < nums[right]) {
                    right = mid;
                } else {
                    // Otherwise, min must be in the right part
                    left = mid + 1;
                }
            }
            return nums[left];
        }

        public static void main(String[] args) {
            int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
            int[] nums2 = {3, 4, 5, 1, 2};

            System.out.println("The minimum element in nums1 is: " + findMin(nums1)); // Output: 0
            System.out.println("The minimum element in nums2 is: " + findMin(nums2)); // Output: 1
        }
    }


