package arrays.spiralmatrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();

        if(matrix == null || matrix.length == 0){
            return spiral;
        }

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int total = matrix.length * matrix[0].length;

        while(spiral.size() < total){
            for(int i=left;i<=right && spiral.size()<total;i++){
                spiral.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom && spiral.size()<total;i++){
                spiral.add(matrix[i][right]);
            }
            right--;
            for(int i=right;i>=left && spiral.size()<total;i--){
                spiral.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i=bottom;i>=top && spiral.size()<total;i--){
                spiral.add(matrix[i][left]);
            }
            left++;
        }
        return spiral;
    }

}
