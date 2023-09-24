public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= {1,3,5,7,9};
        System.out.println(binarysearch(arr, 3, 0, arr.length-1));
    }

    static int binarysearch(int[] arr, int target, int start, int end){
        if (start>end){
            return -1;
        }
        int mid= start+ (end-start)/2;
        if (arr[mid]==target){
            return mid;
        }
        if (arr[mid]>target){
            return binarysearch(arr, target, start, mid-1);
        }
        if (arr[mid]<target){
            return binarysearch(arr, target,mid+1, end);
        }
        return -1;
    }
}
