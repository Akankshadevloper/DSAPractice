package ArrayAndArrayList;

public class MaxRange {
    public static void main(String[] args) {
        int[] arr = {1 , 3 ,23, 9, 18};
        System.out.println(maxRange(arr, 2 ,5));
    }
    static int maxRange(int[] arr, int start, int end) {
        int max = arr[start];
        for (int i = start; i < end; i++) {
           if (arr[i] > max) {
               max = arr[i];
           }
        }
        return max;
    }
}
