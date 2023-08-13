public class FloorofNumber {
        public static void main(String[] args) {
            int[] arr={2,3,5,9,14,16,18}; //Sorted Array is must
            int target=15;
            System.out.println(Floor(arr,target));
        }

        static int Floor(int[] arr, int target){
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
            return end;
        }
    }
