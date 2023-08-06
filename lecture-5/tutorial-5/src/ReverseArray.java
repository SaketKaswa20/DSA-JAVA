import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        Rev(arr);
        System.out.println(Arrays.toString(arr));

    }
//Doing Something Wrong ig
    static void Rev(int[] arr){
        for (int i = 0; i <= (arr.length)/2; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-1];
            arr[arr.length-1]=temp;
        }
    }
}
