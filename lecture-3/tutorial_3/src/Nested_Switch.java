import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int empID= input.nextInt();
        String department= input.next();

        switch (empID){
            case 1:
                System.out.println("Kunal Kushwaha");
                break;
            case 2:
                System.out.println("Rahul Rana");
                break;
            case 3:
                switch (department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Managemet Dept");
                        break;
                    default:
                        System.out.println("Employee");
                }
                break;
            default:
                System.out.println("Enter correct Employee ID");
        }

        //Enhanced Version
        switch (empID) {
            case 1 -> System.out.println("Kunal Kushwaha");
            case 2 -> System.out.println("Rahul Rana");
            case 3 -> {
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Managemet Dept");
                    default -> System.out.println("Employee");
                }
            }
            default -> System.out.println("Enter correct Employee ID");
        }
    }
}
