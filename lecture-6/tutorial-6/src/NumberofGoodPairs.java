// https://leetcode.com/problems/number-of-good-pairs/
public class NumberofGoodPairs {
    public static void main(String[] args) {
        int[] nums= {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }

    //class Solution {
        static int numIdenticalPairs(int[] nums) { //change static to public when submitting on Leetcode
            int goodPairs=0;
            for(int i=0; i< nums.length; i++){
                for(int j=i+1; j<nums.length; j++){
                    if(nums[i]==nums[j]){
                        goodPairs++;
                    }
                }
            }
            return goodPairs;
        }
    //}
}
