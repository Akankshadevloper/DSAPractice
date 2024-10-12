package LINEARSEARCH;

public class EvenNumberDigit {
    public static void main(String[] args) {
        int[] nums =  {12, 345, 2, 6, 7896};
        System.out.println(findNumber(nums));

        System.out.println(digit(0));

        System.out.println(digit2(121234));


        System.out.println(even(12125));

    }

    static int findNumber(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // Function to check whether a number contains an even number of digits
    static boolean even(int num) {
        int numberOfDigits = digit(num);
        return numberOfDigits % 2 == 0;
    }



    //shortcut to find number of digit
    static int digit2(int num){
        return (int)(Math.log10(num))+1;
    }



    // Function to count the number of digits in a number
    static int digit(int num) {

        if(num < 0){
            num = num * -1;
        }

        if(num == 0){
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;  // Divide by 10 to remove the last digit
        }
        return count;
    }
}
