package StringAndStringBuilder;

public class PalinDrom {
    public static void main(String[] args) {
        String str = null;
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str) {

        if(str == null  || str.length() == 0  ){
            return true;
        }
       str = str.toLowerCase();
       for(int i = 0; i < str.length()/2; i++) {
           char strat = str.charAt(i);
           char str2 = str.charAt(str.length()-i-1);

           if(strat != str2) {
               return false;
           }
       }
       return true;
    }
}
