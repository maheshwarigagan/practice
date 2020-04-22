package arrays.leftmostwithone;

import java.util.List;

public class LeftmostColumnWithAtLeastAOne {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> dimension = binaryMatrix.dimensions();
        int row = dimension.get(0);
        int column = dimension.get(1);
        int min_index = column;
        int i = 0, j = column-1;

        while(i<row && j>=0){
            int current = binaryMatrix.get(i,j);
            if(current == 0){
                i++;
            }else{
                min_index = Math.min(min_index, j);
                j--;
            }
        }

        return min_index==column ? -1 : min_index;
    }
}
