public class Pattern_5 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColsinRow= row>n? 2*n-row-1:row;
                for (int Cols = 0; Cols < totalColsinRow; Cols++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
}
