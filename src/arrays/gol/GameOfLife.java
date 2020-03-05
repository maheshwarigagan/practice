package arrays.gol;

public class GameOfLife {
    public static void gameOfLife(int[][] board) {
        //Solution with no additional space being used.

        int[] directions = new int[]{1,0,-1}; // since we will treat it as both row and column, taking care of 8                                          // neighbours.

        int rows = board.length;
        int columns = board[0].length;

        for(int row=0;row<rows;row++){
            for(int col=0;col<columns;col++){


                int liveNeighbours = 0;

                for(int k=0;k<3;k++){
                    for(int j=0;j<3;j++){
                        if(!(directions[k]==0 && directions[j]==0)){
                            int r = directions[k]+row;
                            int c = directions[j]+col;
                            if(r>=0 && r<rows && c >=0 && c<columns && Math.abs(board[r][c])==1){
                                liveNeighbours += 1;
                            }
                        }
                    }
                }

                // kill him if alive, due to over/under population
                if(board[row][col]==1 && (liveNeighbours < 2 || liveNeighbours >3)){
                    board[row][col] = -1;
                }

                // resurrect if killed
                if(board[row][col]==0 && liveNeighbours ==3){
                    board[row][col] = 2;
                }


            }
        }

        for(int row = 0; row < rows; row++){
            for(int col = 0; col < columns; col++){
                if(board[row][col]>0)
                    board[row][col] = 1;
                else
                    board[row][col] = 0;
            }
        }
    }
}
