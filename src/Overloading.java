import java.lang.reflect.Array;
import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
//        fun(67);
//        fun("shank");
//        int ans = sum(3,4);
//        System.out.println(ans);
//        demo(2,3,4,5);
        demo("akaksha","bibek","Rajesh");
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }


    static int sum (int a , int b){
        return a + b ;
    }

    static void fun(int a ){
        System.out.println("First one ");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("Second one ");
        System.out.println(name);

    }
}
