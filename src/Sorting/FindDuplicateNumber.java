package Sorting;

public class FindDuplicateNumber {

    // Main method for testing
    public static void main(String[] args) {
        FindDuplicateNumber finder = new FindDuplicateNumber();

        int[] arr1 = {1, 3, 4, 2, 2};
        System.out.println("Duplicate in arr1: " + finder.findDuplicate(arr1));  // Output: 2

        int[] arr2 = {3, 1, 3, 4, 2};
        System.out.println("Duplicate in arr2: " + finder.findDuplicate(arr2));  // Output: 3
    }

    // Method to find the duplicate number
    public int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // Check if the current number is at the correct index
            int correct = arr[i] - 1;

            // If the number is not at the correct index and it's not a duplicate
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);  // Place it in the correct position
            } else if (arr[i] == arr[correct] && i != correct) {
                // If we find a duplicate (the value matches but the index doesn't)
                return arr[i];
            } else {
                i++;
            }
        }
        return -1;  // If no duplicate is found
    }

    // Utility method to swap two elements in the array
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
