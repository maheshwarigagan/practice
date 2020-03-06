package graph.pathwithminmaxval;

import java.util.PriorityQueue;

// https://leetcode.com/problems/path-with-maximum-minimum-value/
public class PathWithMaximumMinimumValue {
    public static int maximumMinimumPath(int[][] A) {
        int[][] direction = new int[][]{{0,1},{0,-1},{-1,0},{1,0}};
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->b[0]-a[0]);
        pq.add(new int[]{A[0][0],0,0});
        int maximum = A[0][0];
        A[0][0] = -1;
        int final_r = A.length-1;
        int final_c = A[0].length-1;
        while(!pq.isEmpty()){
            int[] current = pq.poll();
            int c_r = current[1];
            int c_c = current[2];

            maximum = Math.min(maximum, current[0]);

            if(c_r == final_r && c_c == final_c){
                break;
            }

            for(int[] d: direction){
                int row = d[0]+c_r;
                int col = d[1]+c_c;
                if(row>=0 && row<A.length && col>=0 && col<A[0].length && A[row][col] >= 0){
                    pq.add(new int[]{A[row][col],row,col});
                    A[c_r][c_c] = -1;
                }
            }
        }

        return maximum;
    }

}
