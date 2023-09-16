// https://leetcode.com/problems/missing-number/
//Amazon Interview Question

public class MissingNumber_CyclicSort {

    public static void main(String[] args) {
        int[] arr= {3,0,1};
        System.out.println(missingNumbert(arr));
    }
    static int missingNumbert(int[] arr){
        int i=0;
        while (i< arr.length){
            int correctindex=arr[i];
            if (arr[i]<arr.length && arr[i] != arr[correctindex]){
                swap(arr, i, correctindex);
            }else {
                i++;
            }
        }

        //search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]!=index){
                return index;
            }
        }

        return arr.length;
    }

    static void swap(int[] arr, int first, int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
