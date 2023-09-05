import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr,5)));
    }

    static int[] binarySearch(int[][] matrix, int row, int colstart, int colend, int target){
        while (colstart<colend){
            int mid= colstart+(colend-colstart)/2;
            if (matrix[row][mid]==target){
                return new int[]{row, mid};
            }
            if (matrix[row][mid]<target){
                colstart=mid+1;
            }else {
                colend=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix, int target){
        int rows=matrix.length;
        int cols= matrix[0].length; //matrix may be empty
        if (rows==1){
            return binarySearch(matrix,0,0, cols-1, target);
        }

        int rowstart=0;
        int rowend=rows-1;
        int Cmid=cols/2;

        while(rowstart <rowend-1){
            int mid= rowstart+(rowend-rowstart)/2;
            if (matrix[mid][Cmid]==target){
                return new int[]{mid, Cmid};
            }
            if (matrix[mid][Cmid]<target){
                rowstart=mid;
            }else {
                rowend=mid;
            }
        }

        //now we have 2 rows
        //now search in columns of two rows
        if (matrix[rowstart][Cmid]==target){
            return new int[]{rowstart,Cmid};
        }

        if (matrix[rowstart+1][Cmid]==target){
            return new int[]{rowstart+1,Cmid};
        }

        //search in 1st half
        if (target<=matrix[rowstart][Cmid-1]){
            return binarySearch(matrix, rowstart, 0, Cmid-1,target);
        }
        //search in 2nd half
        if (target>=matrix[rowstart][Cmid+1] && target<=matrix[rowstart][cols-1]){
            return binarySearch(matrix, rowstart, Cmid+1, cols-1,target);
        }
        //search in 3rd half
        if (target<=matrix[rowstart+1][Cmid-1]){
            return binarySearch(matrix, rowstart+1, 0, Cmid-1,target);
        }
        //search in 4th half
        else{
            return binarySearch(matrix, rowstart+1, Cmid+1, cols-1,target);
        }
    }
}
