import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class GreaterNumberofCandies {
    public static void main(String[] args) {
        int[] candies ={2,3,5,1,3};
        int extraCandies=3;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }

    //class Solution {
        static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) { //change to public when submitting on Leetcode
            ArrayList<Boolean> list= new ArrayList<>();
            int max=candies[0];
            for(int i=0; i<=candies.length-1; i++){
                if(candies[i]>=max){
                    max=candies[i];
                }
            }
            for(int i=0; i<=candies.length-1; i++){
                if(candies[i]+extraCandies>=max){
                    list.add(true);
                }else{
                    list.add(false);
                }
            }
            return list;
        }
  //  }
}
