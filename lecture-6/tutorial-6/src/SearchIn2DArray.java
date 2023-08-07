import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3},{4,5,6}};
        int target=4;
        int[] ans= Find(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] Find(int[][] arr, int target){
        if (arr.length==0){
            return null;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

}
