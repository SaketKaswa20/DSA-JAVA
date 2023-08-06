import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};

        System.out.println(MaxNum(arr));
    }

    static int MaxNum(int[] arr){
        int max= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
