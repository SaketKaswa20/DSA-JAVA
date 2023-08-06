import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Switch Case
          Scanner input= new Scanner(System.in);
//        String fruit= input.nextLine();
//
//        switch (fruit) {
//            case "Mango" -> System.out.println("Kings of fruits");
//            case "Apple" -> System.out.println("Keeps doctor away");
//            case "Grape" -> System.out.println("You want wine?");
//            default -> System.out.println("You should like some fruit");
//        }
//        Shortcut to change into enhanced switch:
//        In Mac: option+return
//        In Windows: alt+enter

        //---------------------------New Program------------------------//

        int num= input.nextInt();

//        switch (num) {
//            case 1 -> System.out.println("MONDAY");
//            case 2 -> System.out.println("TUESDAY");
//            case 3 -> System.out.println("WEDNESDAY");
//            case 4 -> System.out.println("THURSDAY");
//            case 5 -> System.out.println("FRIDAY");
//            case 6 -> System.out.println("SATURDAY");
//            case 7 -> System.out.println("SUNDAY");
//            default -> System.out.println("Enter a number between 1 to 7");
//        }

        //Weekend or Weekday

        switch (num) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("WEEKDAY");
                break;
            case 6:
            case 7:
                System.out.println("WEEKEND");
                break;
        }

        //Enhanced Version
        switch (num) {
            case 1, 2, 3, 4, 5 -> System.out.println("WEEKDAY");
            case 6, 7 -> System.out.println("WEEKEND");
        }

    }
}