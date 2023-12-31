//https://leetcode.com/problems/first-missing-positive/
public class FindMissingPositive {
    public static void main(String[] args) {
//        int[] nums= {7,8,9,11,12};
        int[] nums= {3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }

    static int firstMissingPositive(int[] arr) {
        int i=0;
        while (i< arr.length){
            int correctindex=arr[i]-1;
            if (arr[i]>0 && arr[i]<arr.length && arr[i] != arr[correctindex]){
                swap(arr, i, correctindex);
            }else {
                i++;
            }
        }

        //search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]!=index+1){
                return index+1;
            }
        }

        return arr.length+1;
    }

    static void swap(int[] arr, int first, int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
