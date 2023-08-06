import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
    }

    //That's how a function is defined
    static void sum(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int num1= input.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2= input.nextInt();

        int sum= num1+num2;

        System.out.println("The sum "+sum);
    }
}
