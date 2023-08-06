import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        /*
        Suppose we want to create a array which looks like the matrix
            1 2 3
            4 5 6
            7 8 9

            1-D array is defined using int[]
            2-D array is defined using int[][]
         */

     //   int[][] arr= new int[3][3] //First bracket is for number of rows and othe is number of columns, number sof columns is not needed to be specified

//        int[][] arr= {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        arr[0] will give output {1,2,3} and arr[0][1] will give output 2

//        int[][] arr= {
//                {1,2,3},
//                {4,5},
//                {7,8,9}
//        };
//      The number of columns can be different in each row


        //Now taking 2D Array as Input
        int[][] arr= new int[3][3];

        //input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]= input.nextInt();
            }
        }

        //output
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]+ " ");
//            }
//            System.out.println();
//        }

        //Or

//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
        
        //or

        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
