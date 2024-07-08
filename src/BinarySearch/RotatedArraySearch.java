package BinarySearch;

public class RotatedArraySearch {

        public static int search(int[] nums, int target)
        {
            int left = 0, right = nums.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                // Case 1: If the middle element is the target
                if (nums[mid] == target) {
                    return mid;
                }

                // Case 2: Left half is sorted
                if (nums[mid] >= nums[left]) {
                    // If the target is in the sorted left half
                    if (target >= nums[left]
                            && target < nums[mid]) {
                        right = mid - 1;
                    }
                    else {
                        left = mid + 1;
                    }
                }
                // Case 3: Right half is sorted
                else {
                    // If the target is in the sorted right half
                    if (target > nums[mid]
                            && target <= nums[right]) {
                        left = mid + 1;
                    }
                    else {
                        right = mid - 1;
                    }
                }
            }

            // Target not found
            return -1;
        }

        public static void main(String[] args)
        {
            int[] arr1 = { 4, 5, 6, 7, 0, 1, 2 };
            int target1 = 0;
            int result1 = search(arr1, target1);
            System.out.println(result1); // Output: 4

            int[] arr2 = { 4, 5, 6, 7, 0, 1, 2 };
            int target2 = 3;
            int result2 = search(arr2, target2);
            System.out.println(result2); // Output: -1
        }
    }


