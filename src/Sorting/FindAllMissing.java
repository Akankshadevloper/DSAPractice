package Sorting;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissing {

    // Main method for testing
    public static void main(String[] args) {
        FindAllMissing findMissing = new FindAllMissing();

        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("Missing numbers: " + findMissing.findDuplicates(nums1));  // Output: [5, 6]

        int[] nums2 = {1, 1};
        System.out.println("Missing numbers: " + findMissing.findDuplicates(nums2));  // Output: [2]
    }

    // Method to find all duplicates in the array
    public List<Integer> findDuplicates(int[] nums) {
        // Sort the array using cyclic sort
        sort(nums);

        // Create a list to store duplicates
        List<Integer> ans = new ArrayList<>();
        // After sorting, find the duplicates
        for (int i = 0; i < nums.length; i++) {
            // If the value is not in its correct index, it's a duplicate
            if (nums[i] != i + 1) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }

    // Cyclic sort method
    static void sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;  // Calculate the correct index for nums[i]
            // If the value is not in the correct index and is not a duplicate, swap it to its correct place
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);  // Swap nums[i] with nums[correctIndex] if not in the correct place
            } else {
                i++;
            }
        }
    }

    // Utility method to swap two elements in an array
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}