public class FindUnique2 {
    public static void main(String[] args) {
        int[] arr = {-2,2,3,-3,6,-6,5,7,-7};
        System.out.println(ans(arr));
    }
    private static int ans(int[] arr) {
        int unique = 0;

        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }
}
