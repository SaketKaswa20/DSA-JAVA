public class Numbers_Example {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n){
        if (n==5){
            System.out.println(5);
        }else {
            System.out.println(n);
            print(n+1);
        }
    }
}
