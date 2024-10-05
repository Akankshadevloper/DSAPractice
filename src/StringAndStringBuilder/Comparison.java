package StringAndStringBuilder;

public class Comparison {
    public static void main(String[] args) {
         String a = "Ak";
         String b = "Ak";


         //as we know it is same they are store in heap memory inside string pool but how? by using ==
        System.out.println(a == b);


        String name1 = new String("Ak");
        String name2 = new String("Ak");

//        System.out.println(name1 == name2);
//
//        System.out.println(name1.equals(name2));

        System.out.println(name1.charAt(0));

    }
}
