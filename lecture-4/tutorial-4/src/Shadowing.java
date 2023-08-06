public class Shadowing {
    static int x=90;
    public static void main(String[] args) {
        System.out.println(x); //This will print 90
        int x=40;
        System.out.println(x);//This will print 40. The inside 40 has shadowed the 90 which is above
        //Scope will begin when the value is initialised
    }
}
