import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates_CyclicSort {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
    static List<Integer> findDuplicates(int[] arr) {
        int i=0;
        List<Integer> duplicates= new ArrayList<>();
        while (i < arr.length) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1){
                duplicates.add(arr[index]);
            }
        }
        return duplicates;
    }

    static void swap(int[] arr, int first, int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

