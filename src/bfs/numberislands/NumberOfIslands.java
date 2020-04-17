package bfs.numberislands;

public class NumberOfIslands {
    public static int numIslands(char[][] grid) {
        if(grid.length == 0 || grid[0].length == 0){
            return 0;
        }
        int nr = grid.length;
        int nc = grid[0].length;
        int count = 0;
        for(int i=0;i<nr;i++){
            for(int j=0;j<nc;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    public static void dfs(char[][] grid, int row, int column) {

        if(row < 0 || column < 0 || row >= grid.length || column >= grid[0].length
                || grid[row][column] == '0') {
            return;
        }

        grid[row][column] = '0';
        dfs(grid, row-1,column);
        dfs(grid, row+1,column);
        dfs(grid, row, column-1);
        dfs(grid, row, column+1);
    }

}
