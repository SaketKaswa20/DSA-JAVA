import java.util.Arrays;
//VarArgs is Variable length of Arguements
public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,8);
        multiple(2,3,"Saket", "Kunal");
    }

    static void multiple(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    //int ...v will take multiple inputs and store it as an array, same we can do as String ...v, char ...v
}

//Function havng same name and different arguments then it is called function overloading.
