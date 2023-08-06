public class Greeting {
    public static void main(String[] args) {
//        String message= greet();
//        System.out.println(message);
//    }
//
//    static String greet(){
//        String greeting= "how are you";
//        return greeting;

        String Personalised= MyGreet("Saket Kaswa");
        System.out.println(Personalised);
    }

    static String MyGreet(String name) {
        String message= "Hello "+name;
        return message;
    }

}
