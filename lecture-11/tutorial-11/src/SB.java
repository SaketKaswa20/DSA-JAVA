public class SB {
    //String Builder
    //It is a data type which is mutable in case of springs
    public static void main(String[] args) {
        StringBuilder builder= new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch= (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
    }
}
