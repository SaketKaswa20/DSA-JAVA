import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
//        int[] arr= new int[5];
//        arr[0]=23;
//        arr[1]=543;
//        arr[2]=27;
//        arr[3]=56;
//        arr[4]=89;
//        System.out.println(arr[4]);

        //input using for loops

//        for(int i=0; i< arr.length ; i++ ){
//            arr[i]= input.nextInt();
//        }
//        System.out.println(Arrays.toString(arr)); //Best way to print a array

//        for(int i=0; i< arr.length ; i++ ){
//            System.out.print(arr[i]+ " ");
//        }

        //Array of objects
        String[] str= new String[4];
        for (int i=0; i< str.length; i++){
            str[i]=input.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
