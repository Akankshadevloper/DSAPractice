package StringAndStringBuilder;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a"+"b");
        System.out.println('a'+3);
        System.out.println((char)('a'+ 3 ));


        System.out.println("a"+ 1);
        //integer will be converted to Integer that will call toString()
        //this is same as after few steps: "a"+"1"

        System.out.println("Akanksha" + new ArrayList<>());


    }
}
