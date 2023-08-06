import java.time.Period;
import java.util.Scanner;

public class Assignment_2 {
    public static void main(String[] args) {
//        1. Area Of Circle Java Program and Perimeter Of Circle
//        Scanner input= new Scanner(System.in);
//        System.out.println("Enter radius of circle");
//        float r= input.nextFloat();
//        double pi= 3.14;
//        double Area=  (pi)*(r)*(r);
//        double Perimeter= 2*pi*r;
//        System.out.println("Area "+ Area);
//        System.out.println("Perimeter "+ Perimeter);

//        2. Area Of Triangle
//        Scanner input= new Scanner(System.in);
//        System.out.println("Enter height and base of triangle: ");
//        int height= input.nextInt();
//        int base= input.nextInt();
//
//        double Area= 0.5*base*height;
//        System.out.println("Area "+Area);

//        3. Area Of Rectangle Program and Perimeter Of Rectangle
//        Scanner input= new Scanner(System.in);
//        System.out.println("Enter Length and Breadth of Rectangle: ");
//        int length= input.nextInt();
//        int breadth= input.nextInt();
//
//        int Area= length*breadth;
//        int Perimeter= 2*length+2*breadth;
//        System.out.println("Area "+ Area);
//        System.out.println("Perimeter "+ Perimeter);

//        4. Area Of Equilateral Triangle and Perimeter Of Equilateral Triangle
//        Scanner input= new Scanner(System.in);
//        System.out.println("Enter side of Isoceles Triangle:  ");
//        int side= input.nextInt();
//
//        double Area= (Math.sqrt(3)/4)*side*side;
//        int Perimeter= 3*side;
//        System.out.println("Area " + Area);
//        System.out.println("Perimeter "+ Perimeter);

//        5. Volume Of Cone Java Program
//        Scanner input= new Scanner(System.in);
//        double pi= 3.14;
//        System.out.println("Enter radius of base and height of cone: ");
//        int radius= input.nextInt();
//        int height= input.nextInt();
//
//        double Volume= (pi*radius*radius*height)/3;
//        System.out.println("Volume "+ Volume);

//        6. Subtract the Product and Sum of Digits of an Integer
//        Scanner input= new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num= input.nextInt();
//        int sum=0;
//        int product=1;
//
//        while(num>0){
//            int digit= num%10;
//            sum=sum+digit;
//            product=product*digit;
//            num=num/10;
//        }
//
//        System.out.println(product-sum);

//        7. Input a number and print all the factors of that number (use loops).
//        Scanner input= new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num= input.nextInt();
//        int i=1;
//
//        while(i<=num){
//            if(num%i==0){
//                System.out.println(i);
//                i=i+1;
//            }
//            else{
//                i=i+1;
//            }
//        }

//        8. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
//        Scanner input= new Scanner(System.in);
//        int sum=0;
//        int num= input.nextInt();
//
//        while(num!=0){
//            sum=sum+num;
//            num= input.nextInt();
//        }
//        System.out.println(sum);

//        9. Take integer inputs till the user enters 0 and print the largest number from all.
//        Scanner input= new Scanner(System.in);
//        int num= input.nextInt();
//        int max=num;
//
//        while(num!=0){
//            num=input.nextInt();
//            if(num>max){
//                max=num;
//            }
//        }
//        if(num==0){
//            System.out.println(max);
//        }

//        Intermediate Java Programs
//
//        1. Factorial Program In Java
//        Scanner input= new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num= input.nextInt();
//        int product=1;
//
//        while(num>0){
//            product=product*num;
//            num=num-1;
//        }
//        System.out.println(product);

//        2. Calculate Electricity Bill
//        Scanner input= new Scanner(System.in);
//        System.out.println("Enter the units consumed: ");
//        int units= input.nextInt();
//        double bill=0;
//
//        if(units<=100){
//            bill= 4.67*units;
//            System.out.println(bill);
//        } else if (units<300) {
//            bill= 100*4.67+ (units-100)*6.58;
//            System.out.println(bill);
//        }

//        3. Calculate Average Of N Numbers
            Scanner input= new Scanner(System.in);
            int num= input.nextInt();
            int count=0;
            int sum=0;

            while(num!=0){
                sum=sum+num;
                num= input.nextInt();
                count=count+1;
            }
            if(num==0){
                System.out.println(sum/count);
            }

    }
}
