public class CeilingofNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7,8,9};
        int target=4;
        System.out.println(Ceiling(arr,target));
    }

    static int Ceiling(int[] arr, int target) {
        int start=0;
        int end= arr.length;
        int mid= start+ (end-start)/2;
        if (arr[mid]==target){
            return target;
        }
        if (arr[mid]> target){
            return arr[mid];
        }
        if (arr[mid]<target){
            return arr[mid+1];
        }
        return -1;
    }
}
