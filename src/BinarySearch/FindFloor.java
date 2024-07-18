package BinarySearch;

public class FindFloor {

        // Function to find the ceiling of `x` in a sorted array nums[low…high].
        // i.e., the smallest integer greater than or equal to `x`
        public static int findCeiling(int[] nums, int left, int right, int x)
        {
            // search space is nums[left…right]

            // base case
            if (nums.length == 0) {
                return -1;
            }

            // if `x` is less than equal to the lowest element in search
            // space, the lowest element is the ceiling
            if (x <= nums[left]) {
                return nums[left];
            }

            // if `x` is more than the highest element in the search space,
            // its ceiling doesn't exist
            if (x > nums[right]) {
                return -1;
            }

            // find the middle index
            int mid = (left + right) / 2;

            // if `x` is equal to the middle element, it is the ceiling
            if (nums[mid] == x) {
                return nums[mid];
            }

            // if `x` is more than the middle element, the ceiling exists in the right
            // subarray nums[mid+1…right]
            else if (nums[mid] < x) {
                return findCeiling(nums, mid + 1, right, x);
            }

            // if `x` is less than the middle element, the ceiling exists in the left
            // subarray nums[left…mid] (Note – middle element can also be ceiling)
            else {
                return findCeiling(nums, left, mid, x);
            }
        }

        // Function to find the floor of `x` in a sorted array nums[left…right].
        // i.e., the largest integer less than or equal to `x`
        public static int findFloor(int[] nums, int left, int right, int x)
        {
            // search space is nums[left…right]

            // base case
            if (nums.length == 0) {
                return -1;
            }

            // if `x` is less than the lowest element in search
            // space, its floor doesn't exist
            if (x < nums[left]) {
                return -1;
            }

            // if `x` is more than equal to the highest element in
            // the search space, it is the floor
            if (x >= nums[right]) {
                return nums[right];
            }

            // find the middle index
            int mid = (left + right) / 2;

            // this check is placed to handle infinite loop for
            // a call to `findFloor(nums, mid, right, x)`
            if (mid == left) {
                return nums[left];
            }

            // if `x` is equal to the middle element, it is the floor
            if (nums[mid] == x) {
                return nums[mid];
            }

            // if `x` is more than the middle element, the floor exists in the right
            // subarray nums[mid…right] (Note – middle element can also be the floor)
            else if (nums[mid] < x) {
                return findFloor(nums, mid, right, x);
            }

            // if `x` is less than the middle element, the floor exists in the left
            // subarray nums[left…mid-1]
            else {
                return findFloor(nums, left, mid - 1, x);
            }
        }

        public static void main(String[] args)
        {
            int[] nums = { 1, 4, 6, 8, 9 };

            for (int i = 0; i <= 10; i++)
            {
                System.out.printf("Number %2d —> ceiling is %2d, floor is %2d\n", i,
                        findCeiling(nums, 0, nums.length - 1, i),
                        findFloor(nums, 0, nums.length - 1, i));
            }
        }
    }



