package Sorting;

class MissingNumber {

    // Main method for testing
    public static void main(String[] args) {
        MissingNumber missingNum = new MissingNumber();

        int[] nums1 = {3, 0, 1};
        System.out.println("Missing number: " + missingNum.missingNumber(nums1));  // Output: 2

        int[] nums2 = {0, 1};
        System.out.println("Missing number: " + missingNum.missingNumber(nums2));  // Output: 2

        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("Missing number: " + missingNum.missingNumber(nums3));  // Output: 8
    }

    // Method to find the missing number
    public int missingNumber(int[] nums) {
        // First, sort the array using cyclic sort
        sort(nums);

        // Search for the first missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        // If all numbers are in their correct positions, the missing number is n (length of array)
        return nums.length;
    }

    // Utility method to swap two elements in an array
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // Cyclic sort to place each number in its correct index
    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];  // The value itself should be the index
            // Swap if the current number is not in the correct index and is within range
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }
}
