public class SwapNum {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //swap two numbers
//        int temp = a;
//        a=b;
//        b=temp;

        swap(a,b);
        System.out.println(a + " " + b);
    }

    static void swap(int a , int b){

        int temp = a;
        a = b;
        b = temp;
    }
}
