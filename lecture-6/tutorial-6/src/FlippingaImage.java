import java.util.Arrays;
//https://leetcode.com/problems/flipping-an-image/description/

public class FlippingaImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},
                {1,0,1},
                {0,0,0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }

//    class Solution {
        static int[][] flipAndInvertImage(int[][] image) { //change static to public when uploading on LeetCode
            int i = 0;
            int a = 0;
            int temp = 0;

            //Reversal
            while(i < image.length){
                int b = image.length-1;
                while(a <= b){
                    /*System.out.println(i);*/
                    temp = image[i][b];
                    image[i][b] = image[i][a];
                    image[i][a] = temp;
                    /*System.out.println(a+" "+b);*/
                    a++;
                    b--;
                    /*System.out.println(a+" "+b);*/
                }
                a = 0;
                b = 0;
                i++;
            }

//Output for reference.
/*for(int o=0; o<image.length; o++){
for(int j=0; j<image.length; j++){
System.out.print(image[o][j]);
}
System.out.println();
}
System.out.println();*/

            //Inverting
            for(int j = 0; j < image.length; j++){
                for(int k = 0; k < image.length; k++){
                    if(image[j][k] == 0){
                        image[j][k] = 1;
                    }else{
                        image[j][k] = 0;
                    }
                }
            }

//Output for reference.
/*for(int o=0; o<image.length; o++){
for(int j=0; j<image.length; j++){
System.out.print(image[o][j]);
}
System.out.println();
}*/

            return image;
        }
//    }
}
