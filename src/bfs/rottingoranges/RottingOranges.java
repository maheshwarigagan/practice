package bfs.rottingoranges;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class RottingOranges {
    public static int orangesRotting(int[][] grid) {
        int[] dr = new int[]{-1,0,1,0};
        int[] dc = new int[]{0,-1,0,1};

        int row = grid.length;
        int column = grid[0].length;

        Queue<Integer> q = new LinkedList<>();
        Map<Integer, Integer> depth = new HashMap<>();
        int fresh_count = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(grid[i][j] == 2){
                    int code = i*column+j;
                    q.offer(code);
                    depth.put(code, 0);
                }else if(grid[i][j] == 1){
                    fresh_count++;
                }
            }
        }

        int ans = 0;
        while(!q.isEmpty()){
            int code = q.poll();
            int r = code/column, c = code%column;
            for(int i=0;i<dr.length;i++){
                int nr = r + dr[i];
                int nc = c + dc[i];
                if (0 <= nr && nr < row && 0 <= nc && nc < column && grid[nr][nc] == 1) {
                    fresh_count--;
                    grid[nr][nc] = 2;
                    int newcode = nr*column + nc;
                    q.offer(newcode);
                    depth.put(newcode, depth.get(code)+1);
                    ans = depth.get(newcode);
                }
            }
        }

        return fresh_count == 0 ? ans : -1;


    }
}
