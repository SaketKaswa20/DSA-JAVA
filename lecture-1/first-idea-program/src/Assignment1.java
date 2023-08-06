import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        //   1. Write a program to print whether a number is even or odd, also take input from the user.
//        Scanner input= new Scanner(System.in);
//        System.out.print("Please enter a number:");
//        int num= input.nextInt();
//
//        if(num%2==0){
//            System.out.println("The number is Even");
//        }
//
//        else{
//            System.out.println("The number is Odd");
//        }

//        2. Take name as input and print a greeting message for that particular name.
//        Scanner input= new Scanner(System.in);
//        System.out.println("Please enter your name:");
//        String name= input.nextLine();
//
//        System.out.println("Good Morning "+ name);

//        3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//        Scanner input= new Scanner(System.in);
//        System.out.println("Enter Principal Amount: ");
//        int principal= input.nextInt();
//        System.out.println("Enter Rate of Interest: ");
//        int rate= input.nextInt();
//        System.out.println("Enter Number of Years: ");
//        int years= input.nextInt();
//
//        float simpint= (principal*rate*years)/100;
//
//        System.out.println("The Simple Interest is: "+simpint);

//        4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
//        Scanner input= new Scanner(System.in);
//        System.out.println("Enter first number:");
//        float num1= input.nextFloat();
//        System.out.println("Enter second number:");
//        float num2= input.nextFloat();
//        System.out.println("Enter operation 1. Additon 2. Subtraction 3. Multiplication 4. Division");
//        int operator= input.nextInt();
//
//        if(operator==1){
//            float num3= num1+num2;
//            System.out.println("The addition of two numbers is: "+ num3);
//        }
//        else if(operator==2){
//            System.out.println("The subtraction of two numbers is: "+ (num1-num2));
//        }
//        else if(operator==3){
//            System.out.println("The multiplication of two numbers is: "+ (num1*num2));
//        }
//        else if(operator==4){
//            System.out.println("The division of two numbers is: "+ (num1/num2));
//        }

//        5. Take 2 numbers as input and print the largest number.
//        Scanner input= new Scanner(System.in);
//        System.out.println("Please enter 1st Number:");
//        int num1= input.nextInt();
//        System.out.println("Please enter 2nd Number:");
//        int num2= input.nextInt();
//
//        if(num1>num2){
//            System.out.println(num1);
//        }
//
//        else {
//            System.out.println(num2);
//        }

//        6. Input currency in rupees and output in USD.
//        Scanner input= new Scanner(System.in);
//        System.out.println("Enter Amount in Rupees: ");
//        float rupees= input.nextFloat();
//
//        float dollar= rupees*(0.012f);
//
//        System.out.println("$"+dollar);

//        7. To calculate Fibonacci Series up to n numbers.
//            Scanner input= new Scanner(System.in);
//            System.out.println("Enter value of n: ");
//            int n= input.nextInt();
//            int a=0;
//            int b=1;
//            int count=2;
//        System.out.println(a);
//        System.out.println(b);
//
//        while(count<=n){
//            int num3=a+b;
//            System.out.println(num3);
//            a=b;
//            b=num3;
//            count=count+1;
//        }

//        8. To find out whether the given String is Palindrome or not.
//        Scanner input= new Scanner(System.in);
//        System.out.println("Enter your string: ");
//        String word= input.nextLine();
//        String reverse="";
//
//        for (int i = word.length()-1; i >=0 ; i--) {
//            reverse = reverse + word.charAt(i);
//        }
//        if(word.equals(reverse)){
//            System.out.println("String is palindrome");
//        }
//        else{
//            System.out.println("String is not palindrome");
//        }

//        9. To find Armstrong Number between two given number.
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter 1st Number");
//        int num1= input.nextInt();
//        System.out.println("Enter 2nd number");
//        int num2= input.nextInt();
//
//        for (int i = num1; i<num2; i++){
//            int check, rem, sum = 0;
//            check = i;
//            while(check != 0) {
//                rem = check % 10;
//                sum = sum + (rem * rem * rem);
//                check = check / 10;
//            }
//            if(sum == i){
//                System.out.println(""+i+" is an Armstrong number.");
//            }
//        }

    }


}
