import java.util.List;

public class CountItemsMatchingRule {
    public static void main(String[] args) {
//        List<List<String>> items = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
//        String ruleKey = "color";
//        String ruleValue = "silver";
//        System.out.println(countMatches(items, ruleKey, ruleValue));
    }

//    class Solution {
        static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) { //change static to public before uploading on Leetcode
            int count=0;
            if(ruleKey.equals("type")){
                for(int i=0; i<items.size(); i++){
                    if(items.get(i).get(0).equals(ruleValue)){
                        count++;
                        continue;
                    }
                }
            }
            if(ruleKey.equals("color")){
                for(int i=0; i<items.size(); i++){
                    if(items.get(i).get(1).equals(ruleValue)){
                        count++;
                        continue;
                    }
                }
            }
            if(ruleKey.equals("name")){
                for(int i=0; i<items.size(); i++){
                    if(items.get(i).get(2).equals(ruleValue)){
                        count++;
                        continue;
                    }
                }
            }
            return count;
        }
//    }
}
