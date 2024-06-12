package LinearSearch;

public class ElementExists {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int index = 5;

        int ans = getElementAtIndex(nums, index);
        System.out.println(ans);
    }

    // Search in the array: return the element at the specified index if valid
    // Otherwise, if index is not valid, return Integer.MIN_VALUE
    static int getElementAtIndex(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            return Integer.MIN_VALUE;
        }

        return arr[index];
    }
}
