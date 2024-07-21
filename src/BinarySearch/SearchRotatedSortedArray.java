package BinarySearch;

public class SearchRotatedSortedArray {


        // Function to search for the target in the rotated sorted array
        public static int search(int[] nums, int target) {
            int low = 0, high = nums.length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (nums[mid] == target) {
                    return mid; // Target found
                }

                // Determine which half is properly sorted
                if (nums[low] <= nums[mid]) { // Left half is sorted
                    if (target >= nums[low] && target < nums[mid]) {
                        high = mid - 1; // Target is in the left half
                    } else {
                        low = mid + 1; // Target is in the right half
                    }
                } else { // Right half is sorted
                    if (target > nums[mid] && target <= nums[high]) {
                        low = mid + 1; // Target is in the right half
                    } else {
                        high = mid - 1; // Target is in the left half
                    }
                }
            }

            return -1; // Target not found
        }

        // Main function to test the solution
        public static void main(String[] args) {
            int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
            int target1 = 0;
            int target2 = 3;
            int[] nums2 = {1};
            int target3 = 0;

            System.out.println("Index of target1 in nums1: " + search(nums1, target1)); // Output: 4
            System.out.println("Index of target2 in nums1: " + search(nums1, target2)); // Output: -1
            System.out.println("Index of target3 in nums2: " + search(nums2, target3)); // Output: -1
        }
    }


