public class SearchInStrings {
    public static void main(String[] args) {
         String name= "Saket";
         char target= 'k';
        System.out.println(Search(name,target));
    }

    static boolean Search(String name, char target){
        if(name.length()==0){
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}
