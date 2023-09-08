// https://leetcode.com/problems/find-the-highest-altitude/description/
public class FindtheHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }

//    class Solution {
        static int largestAltitude(int[] gain) { //change static to public before uploading on Leetcode
            int max = 0, sum = 0;
            for(int i: gain){
                sum = sum + i;
                if(max < sum){
                    max = sum;;
                }
            }
            return max;
        }
//    }
}
