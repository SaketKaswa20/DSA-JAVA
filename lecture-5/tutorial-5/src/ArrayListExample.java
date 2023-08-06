import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list= new ArrayList<>(10); //This does not mean it will contain on 10 Objects
//
//        //Adding items in list
//        list.add(54);
//        list.add(567);
//        list.add(69);
//        list.add(54);
//        list.add(73);
//
//        System.out.println(list);//This will print the list
////        System.out.println(list.contains(69)); //This will give answer true as the list contains 69
//        list.set(0,99); //THis will change the integer at 0th index to 99
//        System.out.println(list);
//        list.remove(2); //This wil remove object at index 2
        
        //Input
        for (int i = 0; i < 5; i++) {
            int num= input.nextInt();
            list.add(num);
        }
        System.out.println(list);
    }
}
