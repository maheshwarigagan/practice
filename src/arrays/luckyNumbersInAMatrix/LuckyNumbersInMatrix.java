package arrays.luckyNumbersInAMatrix;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInMatrix {
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> output = new ArrayList<>();

        for(int i=0;i<matrix.length;i++){
            int minimum = Integer.MAX_VALUE;
            int min_index = 0;
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<minimum){
                    minimum = matrix[i][j];
                    min_index = j;
                }
            }

            int maximum = Integer.MIN_VALUE;
            for(int k=0;k<matrix.length;k++){
                if(maximum<matrix[k][min_index]){
                    maximum = matrix[k][min_index];
                }

            }
            if(minimum == maximum){
                output.add(minimum);
            }
        }
        return output;
    }
}
