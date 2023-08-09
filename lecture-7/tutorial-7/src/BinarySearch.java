public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=7;
        System.out.println(binarySearch(arr,target));
    }

    static int binarySearch(int[] arr, int target){
        int start=0;
        int end= arr.length-1;
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
}
//To check if the array is sorted ascending or descending in order then compare the first and last element of the array
// If first>last then it is descending array and if last>first then it is ascending array
