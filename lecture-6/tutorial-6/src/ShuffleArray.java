import java.util.Arrays;

//https://leetcode.com/problems/shuffle-the-array/
public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int n=3;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }

    static int[] shuffle(int[] nums, int n) {
            int arr[] = new int[2*n];
            int j = 0;
            for(int i=0;i<n;i++){
                arr[j]=nums[i];
                j+=2;
            }
            int k=1;
            for(int i=n;i<2*n;i++){
                arr[k]=nums[i];
                k+=2;
            }
            return arr;
        }
}
