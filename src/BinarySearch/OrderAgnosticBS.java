package BinarySearch;

public class OrderAgnosticBS {
    public static void main (String[] args){
        //int [] arr = {-18 , -12 , -4 , 0 , 2 ,3 , 4 , 15 , 16 , 18 , 22 ,45};
        int[] arr1 = {99 , 89 , 72, 66 , 50 , 32 , 22 , 11 , 4 , 2 , 1 };
        int target = 22;

        int ans = orderAgnosticBS(arr1,target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr , int target ){
        int start = 0;
        int end = arr.length - 1;

        //find whether the array is sorted in ascending or descending order
        boolean isAsc = arr[start]<arr[end];


        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            if(arr[mid]== target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
            }
        return -1;
    }
}
