import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/set-mismatch/submissions/
public class SetMismatch_CyclicSort {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    static int[] findErrorNums(int[] arr) {
        int i=0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        int[] ans= new int[2];
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]!=index+1){
                ans[0]=arr[index];
                ans[1]=index+1;
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
