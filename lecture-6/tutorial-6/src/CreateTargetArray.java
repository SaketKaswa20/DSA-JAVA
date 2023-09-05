import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/create-target-array-in-the-given-order/
public class CreateTargetArray {
    public static void main(String[] args) {
        int[] nums ={0,1,2,3,4};
        int[] index ={0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }

    //class Solution {
        static int[] createTargetArray(int[] nums, int[] index) { //change static to public when submitting on Leetcode
            ArrayList<Integer> arr=new ArrayList<Integer>();
            int[] ans=new int[nums.length];
            for(int i=0;i<nums.length;i++){

                arr.add(index[i],nums[i]);
            }
            for(int i=0;i<arr.size();i++){
                ans[i]=arr.get(i);
            }
            return ans;
        }
    //}
}
