import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        String departmentName = sc.next();


        switch (empId){
            case 1:
                System.out.println("Akanksha Kumari");
                break;
                case 2:
                    System.out.println("Bibek Behera ");
                    break;
                    case 3:
                        System.out.println("Emp Number 3");
                        switch (departmentName){
                            case "IT":
                                System.out.println("IT Department");
                                break;
                                case "Management":
                                    System.out.println("Management Department");
                                    break;
                            default:
                                System.out.println("No departement enter ");
                        }
        }
    }
}
