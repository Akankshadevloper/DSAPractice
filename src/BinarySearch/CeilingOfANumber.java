package BinarySearch;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int [] arr = {2, 3 , 5 , 9 , 14 , 16 , 18};
        int target = 15;
        int ans = ceiling(arr,target);
        System.out.println(ans);

    }

    //smallest number >= target element
    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            }else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
