import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
//        1. Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
//        Scanner input= new Scanner(System.in);
//        System.out.print("Enter 1st Number:");
//        int a= input.nextInt();
//        System.out.print("Enter 2nd Number:");
//        int b= input.nextInt();
//        System.out.print("Enter 3rd number:");
//        int c= input.nextInt();
//        int minnum=Min(a,b,c);
//        int maxnum=Max(a,b,c);
//        System.out.println("Minimum Number: "+ minnum);
//        System.out.println("Maximum number: "+ maxnum);
//    }
//
//    static int Min(int a, int b, int c){
//        int min=a;
//        if(b<min){
//            min=b;
//        } else if (c<min) {
//            min=c;
//        }
//        return min;
//    }
//
//    static int Max(int a, int b, int c){
//        int max=a;
//        if(b>max){
//            max=b;
//        } if (c>max) {
//            max=c;
//        }
//        return max;
//    }

//       2. Define a program to find out whether a given number is even or odd.
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n = input.nextInt();
//        String ans = EvenOdd(n);
//        System.out.println(ans);
//    }
//
//    static String EvenOdd(int n){
//        if(n==0){
//            return "Neither";
//        } else if (n%2==0) {
//            return "Even";
//        }else{
//            return "Odd";
//        }
//    }

//        3. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if
//        he/she is eligible to vote.
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your Age: ");
//        int age = input.nextInt();
//        String ans = Vote(age);
//        System.out.println(ans);
//    }
//
//    static String Vote(int age){
//        if(age<18){
//            return "Can't Vote";
//        } else{
//            return "Can Vote";
//        }
//    }

//        4,5. Write a program to print the sum of two numbers entered by user by defining your own method & Define a method
//        that returns the product of two numbers entered by user.
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter 1st Number: ");
//        int a = input.nextInt();
//        System.out.print("Enter 2nd Number: ");
//        int b = input.nextInt();
//        int ans = Sum(a, b);
//        int product= Product(a,b);
//        System.out.println("Sum: "+ans);
//        System.out.println("Product: "+product);
//    }
//
//    static int Sum(int a, int b){
//        int sum= a+b;
//        return sum;
//    }
//
//    static int Product(int a, int b){
//        int product= a*b;
//        return product;
//    }

//        6. Write a program to print the circumference and area of a circle of radius entered by user by defining your
//        own method.
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter radius of circle");
//        int r = input.nextInt();
//        double area = Area(r);
//        double circumference = Circumference(r);
//        System.out.println("Area: " + area);
//        System.out.println("Circumference: " + circumference);
//    }
//
//    static double Area(int r){
//        double Area= 3.14*r*r;
//        return Area;
//    }
//
//    static double Circumference(int r){
//        double Circumference=2*3.14*r;
//        return Circumference;
//    }

//        7. Define a method to find out if a number is prime or not.
//            Solved in Question Java Class
//
//        8. Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display
//        grades according to the marks entered as below:
//        Marks        Grade
//        91-100         AA
//        81-90          AB
//        71-80          BB
//        61-70          BC
//        51-60          CD
//        41-50          DD
//            <=40          Fail
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your Marks: ");
//        int marks = input.nextInt();
//        String grade = Grade(marks);
//        System.out.println("Grade: " + grade);
//    }
//
//    static String Grade(int marks){
//        if(90<marks && marks<101){
//            return "AA";
//        }
//        if (80<marks && marks<91){
//            return "AB";
//        }
//        if(70<marks && marks<81){
//            return "BB";
//        }
//        if(60<marks && marks<71){
//            return "BC";
//        }
//        if(50<marks && marks<61){
//            return "CD";
//        }
//        if(40<marks && marks<51){
//            return "DD";
//        } else{
//            return "Fail";
//        }
//    }

//        9. Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
//                4! = 1 * 2 * 3 * 4 = 24
//        3! = 3 * 2 * 1 = 6
//        2! = 2 * 1 = 2
//        Also,
//                1! = 1
//        0! = 1

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a Number: ");
//        int n = input.nextInt();
//        int factorial = Factorial(n);
//        System.out.println("Factorial: " + factorial);
//    }
//
//    static int Factorial(int n){
//        int fact=1;
//        while(n>0){
//            int digit=n%10;
//            fact=fact*digit;
//            n=n-1;
//        }
//        return fact;
//    }

//        10. Write a function to find if a number is a palindrome or not. Take number as parameter.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = input.nextInt();
        String palindrome = Palindrome(num);
        System.out.println(palindrome);
    }

    static String Palindrome(int num){
        //Need to find this
    }


    }
