import java.util.Arrays;
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class NumsSmallerthanCurrent {
    public static void main(String[] args) {
        int[] nums= {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    //class Solution {
        static int[] smallerNumbersThanCurrent(int[] nums) { //change static to public when submitting on LeetCode
            int[] ans= new int[nums.length];
            for(int i=0; i<nums.length; i++){
                int count=0;
                for(int j=0; j<nums.length; j++){
                    if(nums[j]<nums[i] && j!=i){
                        count++;
                    }
                }
                ans[i]=count;
            }
            return ans;
        }
    //}
}
