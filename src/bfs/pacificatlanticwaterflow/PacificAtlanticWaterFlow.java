package bfs.pacificatlanticwaterflow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PacificAtlanticWaterFlow {
    public static List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> output = new ArrayList<>();
        Map<String, Boolean> isPacificReachable = new HashMap<>();
        Map<String, Boolean> isAtlanticReachable = new HashMap<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                boolean isPacific = bfs(i, j, matrix, true, isPacificReachable, isAtlanticReachable);
                boolean isAtlantic = bfs(i, j, matrix, false, isPacificReachable, isAtlanticReachable);
//                System.out.println("i: "+i+ " " +"j: "+j);
                if(isPacific && isAtlantic){
//                    System.out.println("true i: "+i+ " " +"j: "+j);
                    List<Integer> entry = new ArrayList<>();
                    entry.add(i);
                    entry.add(j);
                    output.add(entry);
                }
            }
        }

        return output;
    }

    private static boolean bfs(int row,
                        int column,
                        int[][] matrix,
                        boolean isPacific,
                        Map<String, Boolean> isPacificReachable,
                        Map<String, Boolean> isAtlanticReachable ){
        if(matrix[row][column] == -1){
            return false;
        }
        if(isPacific && isPacificReachable.containsKey(row+"_"+column)){
            return isPacificReachable.get(row+"_"+column);
        }
        if(!isPacific && isAtlanticReachable.containsKey(row+"_"+column)){
            return isAtlanticReachable.get(row+"_"+column);
        }
        if(isPacific && (row == 0 || column == 0)){
            isPacificReachable.put(row+"_"+column, true);
            return true;
        }

        if(!isPacific && (row == matrix.length-1 || column == matrix[0].length-1)){
            isAtlanticReachable.put(row+"_"+column, true);
            return true;
        }

        int value = matrix[row][column];
        //mark as visited
        matrix[row][column] = -1;
        //explore
        int[] r = {0,1,0,-1};
        int[] c = {1,0,-1,0};
        boolean isReachable = false;
        for(int i=0;i<4;i++){
            //check valid index
            int nr = row + r[i];
            int nc = column +c[i];
            if(nr>=0 && nr<=matrix.length-1 && nc>=0 && nc<=matrix[0].length-1){
                //check if that neighbor has value less than or equal to current value
                if(matrix[nr][nc]<=value){
                    isReachable = isReachable
                            || bfs(nr, nc, matrix, isPacific, isPacificReachable, isAtlanticReachable);
                }
            }
        }

        //unmark
        matrix[row][column] = value;
        if(isPacific){
            isPacificReachable.put(row+"_"+column, isReachable);
        }else{
            isAtlanticReachable.put(row+"_"+column, isReachable);
        }
        return isReachable;
    }

}
