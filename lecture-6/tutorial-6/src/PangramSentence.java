//https://leetcode.com/problems/check-if-the-sentence-is-pangram/

public class PangramSentence {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    static boolean checkIfPangram(String sentence) { //Replace static with public when submitting on LeetCode
        for (int i=97;i<=122;i++)
        {
            if(sentence.indexOf((char)i)<0)
            {
                return false;
            }
        }
        return true;
    }
}
