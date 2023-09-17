public class FindDuplicateNum_CyclicSort {
    public static void main(String[] args) {
        int[] nums= {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] arr) {
        int i=0;
        while (i< arr.length){
            int correctindex=arr[i];
            if (arr[i] != arr[correctindex]){
                swap(arr, i, correctindex);
            }else {
                i++;
            }
        }

        //search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]>index){
                return arr[index];
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

//Kunal's Solution
//package com.kunal;
//// https://leetcode.com/problems/find-the-duplicate-number/
//public class FindDuplicate {
//    public int findDuplicate(int[] arr) {
//        int i = 0;
//        while (i < arr.length) {
//
//            if (arr[i] != i + 1) {
//                int correct = arr[i] - 1;
//                if (arr[i] != arr[correct]) {
//                    swap(arr, i , correct);
//                } else {
//                    return arr[i];
//                }
//            } else {
//                i++;
//            }
//        }
//        return -1;
//    }
//
//    static void swap(int[] arr, int first, int second) {
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//}