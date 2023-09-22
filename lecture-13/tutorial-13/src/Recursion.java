public class Recursion {
    public static void main(String[] args) {
        message();
    }

    static void message(){
        System.out.println("Hello World");
        message1();
    }

    private static void message1() {
        System.out.println("Hello World");
        message2();
    }

    private static void message2() {
        System.out.println("Hello World");
    }
}
