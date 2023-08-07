public class Main {
    public static void main(String[] args) {
        //Linear Search
        int[] arr= {1,2,3,4,5,6};
        int n=4;
        int index=LinearSearch(arr,n);
        System.out.println(index);
    }

    static int LinearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element= arr[i];
            if (element==target){
                return i;
            }
        }
        return -1;
    }
}