//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakIndex {

}

static int BinarySearch(int[] arr, int start, int end){
        int start=0;
        int end= arr.length-1;
        while (start< end){
//            int mid= start+end/2; since start+end can surpass the int limit range
            int mid= start+(end-start)/2;
            int max=arr[mid];

            if (arr[mid]>arr[mid+1]){
                end= mid;
            } else if (arr[mid+1]>arr[mid]) {
                start=mid+1;
            }
        }
        return start; //or return end as at the end both will be pointing towards the same
    }
}