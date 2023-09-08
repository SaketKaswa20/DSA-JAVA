import java.util.Arrays;

public class BubbleSort {
    // Also known as Sinking Sort or Exchange Sort or inPlane Sorting Algorithm
    public static void main(String[] args) {
        int[] nums={5,4,3,2,1};
        bubble(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void bubble(int[] nums){
        //run the steps n-1 times
        for (int i = 0; i < nums.length; i++) {
            //for each step, max item will come at the last irrespective index
            for (int j = 1; j < nums.length-i; j++) {
                if (nums[j]<nums[j-1]){
                    //swap
                    int temp= nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
    }

}
