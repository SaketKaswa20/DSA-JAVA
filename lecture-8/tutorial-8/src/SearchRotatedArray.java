// https://leetcode.com/problems/search-in-rotated-sorted-array/

//My CODE
public class SearchRotatedArray {
    //Approach: 1. Find Pivot [Largest Element]
    //2. Search in first half[Using Binary Search] [start  to pivot]
    //3. Search in another half[Using Binary Search] [pivot+1 to end]
    public static void main(String[] args) {
        int[] arr= {4,5,6,7,0,1,2};
        int target=3;
        System.out.println(search(arr,target));
    }

    static int search(int[] arr, int target) {
        int pivot= findPivot(arr);
        if(pivot==-1){
            return binarySearch(arr, target, 0,arr.length-1 );
        }
        // if pivot is found you have 2 ascending sorted arrays
        if(pivot==target) {
            return pivot;
        }
        if (target>=arr[0]){
            binarySearch(arr, target, 0, pivot-1);
        }
        return binarySearch(arr,target,pivot+1, arr.length-1);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while (start<=end){
//            int mid= start+end/2; since start+end can surpass the int limit range
            int mid= start+(end-start)/2;
            if (target<arr[mid]){
                end= mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr){
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid= start + (end-start)/2;
            // 4 cases
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }else {
                start= mid+1;
            }
        }
        return -1;
    }
}


//Kunal's Code

//    static int search(int[] nums, int target) {
//        int pivot = findPivot(nums);
//
//        // if you did not find a pivot, it means the array is not rotated
//        if (pivot == -1) {
//            // just do normal binary search
//            return binarySearch(nums, target, 0 , nums.length - 1);
//        }
//
//        // if pivot is found, you have found 2 asc sorted arrays
//        if (nums[pivot] == target) {
//            return pivot;
//        }
//
//        if (target >= nums[0]) {
//            return binarySearch(nums, target, 0, pivot - 1);
//        }
//
//        return binarySearch(nums, target, pivot + 1, nums.length - 1);
//    }
//
//    static int binarySearch(int[] arr, int target, int start, int end) {
//        while(start <= end) {
//            // find the middle element
////            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
//            int mid = start + (end - start) / 2;
//
//            if (target < arr[mid]) {
//                end = mid - 1;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                // ans found
//                return mid;
//            }
//        }
//        return -1;
//    }
//
//    // this will not work in duplicate values
//    static int findPivot(int[] arr) {
//        int start = 0;
//        int end = arr.length - 1;
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            // 4 cases over here
//            if (mid < end && arr[mid] > arr[mid + 1]) {
//                return mid;
//            }
//            if (mid > start && arr[mid] < arr[mid - 1]) {
//                return mid-1;
//            }
//            if (arr[mid] <= arr[start]) {
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
//        }
//        return -1;
//    }

