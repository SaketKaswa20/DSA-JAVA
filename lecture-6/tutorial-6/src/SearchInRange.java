public class SearchInRange {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        int target=4;
        System.out.println(SearchInRange(arr,target,1,4));
    }

    static int SearchInRange(int[] arr, int target,int start, int end){
        if(arr.length==0){
            return -1;
        }

        for (int i = start; i <= end; i++) {
            int element= arr[i];
            if (element==target){
                return i;
            }
        }
        return -1;
    }
}
