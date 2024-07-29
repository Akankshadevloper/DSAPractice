package BinarySearch;

    public class SplitArrayLargestSum {
        public static int splitArray(int[] nums, int m) {
            int max = 0;
            int sum = 0;
            for (int num : nums) {
                max = Math.max(max, num);
                sum += num;
            }

            int low = max;
            int high = sum;

            while (low < high) {
                int mid = (low + high) / 2;
                if (canSplit(nums, m, mid)) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
            return low;
        }

        private static boolean canSplit(int[] nums, int m, int maxSum) {
            int count = 1;
            int currentSum = 0;

            for (int num : nums) {
                if (currentSum + num > maxSum) {
                    count++;
                    currentSum = num;
                    if (count > m) {
                        return false;
                    }
                } else {
                    currentSum += num;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            int[] nums1 = {7, 2, 5, 10, 8};
            System.out.println("Minimized Largest Sum: " + splitArray(nums1, 2)); // Output: 18

            int[] nums2 = {1, 2, 3, 4, 5};
            System.out.println("Minimized Largest Sum: " + splitArray(nums2, 2)); // Output: 9
        }
    }

}
