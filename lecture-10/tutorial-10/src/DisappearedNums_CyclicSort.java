import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/

public class DisappearedNums_CyclicSort {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> Missing= new ArrayList<>();
        int i=0;
        while (i< arr.length){
            int correctindex= arr[i]-1;
            if (arr[i] != arr[correctindex]){
                swap(arr, i, correctindex);
            }else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index]!=index+1){
                Missing.add(index+1);
            }
        }
        return Missing;
    }

    static void swap(int[] arr, int first, int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
