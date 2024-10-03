import java.util.Scanner;

public class FruitSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        //old one

//        switch (fruit) {
//            case "Mango":
//                System.out.println("Kings of fruits");
//                break;
//            case "Apple":
//                System.out.println("Apples of fruits");
//                break;
//            case "Pear":
//                System.out.println("Pears of fruits");
//                break;
//            case "Orange":
//                System.out.println("Round fruit");
//                break;
//            default:
//                System.out.println("Please enter a valid fruits");
//                break;
//        }
//    }
//New One
        switch (fruit) {
            case "Mango" -> System.out.println("Kings of fruits");
            case "Apple" -> System.out.println("Apples of fruits");
            case "Pear" -> System.out.println("Pears of fruits");
            case "Orange" -> System.out.println("Round fruit");
            default -> System.out.println("Please enter a valid fruits");
        }
    }
}