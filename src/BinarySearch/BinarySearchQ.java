package BinarySearch;

public class BinarySearchQ {

        // Function to determine if a `target` exists in the sorted array `nums`
        // or not using a binary search algorithm
        public static int binarySearch(int[] nums, int target)
        {
            // search space is nums[left…right]
            int left = 0, right = nums.length - 1;

            // loop till the search space is exhausted
            while (left <= right)
            {
                // find the mid-value in the search space and
                // compares it with the target

                int mid = (left + right) / 2;

                // overflow can happen. Use:
                // int mid = left + (right - left) / 2;
                // int mid = right - (right - left) / 2;

                // target is found
                if (target == nums[mid]) {
                    return mid;
                }

                // discard all elements in the right search space,
                // including the middle element
                else if (target < nums[mid]) {
                    right = mid - 1;
                }

                // discard all elements in the left search space,
                // including the middle element
                else {
                    left = mid + 1;
                }
            }

            // `target` doesn't exist in the array
            return -1;
        }

        public static void main(String[] args)
        {
            int[] nums = { 2, 5, 6, 8, 9, 10 };
            int target = 5;

            int index = binarySearch(nums, target);

            if (index != -1) {
                System.out.println("Element found at index " + index);
            }
            else {
                System.out.println("Element not found in the array");
            }
        }
    }

