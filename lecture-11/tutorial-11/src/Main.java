public class Main {
    public static void main(String[] args) {
        String a= "Saket";
        String b= "Saket";

//        System.out.println(a==b);
        String name1= new String("Saket");
        String name2= new String("Saket");
        System.out.println(name1.equals(name2));
        System.out.println(name1==name2); //this will give false because we have explicitly mentioned new keyword
        System.out.println(name1.charAt(0)); //This will print S
    }
}
