package bfs.surroundedregions;

public class SurroundedRegions {
    public static void solve(char[][] board) {
        // iterate over the board and mark all the border connected O to some other character
        // since they will stay the same.
        if(board == null || board.length == 0 || board[0].length == 0){
            return;
        }

        // first row
        for(int i=0; i<board[0].length;i++){
            if(board[0][i] == 'O')
                bfs(board, 0, i);
        }

        // last row
        for(int i=0; i<board[0].length;i++){
            if(board[board.length-1][i] == 'O')
                bfs(board, board.length-1, i);
        }

        // first column
        for(int i=0; i<board.length;i++){
            if(board[i][0] == 'O')
                bfs(board, i, 0);
        }

        // last column
        for(int i=0; i<board.length;i++){
            if(board[i][board[0].length-1] == 'O')
                bfs(board, i, board[0].length-1);
        }

        // change the remaining O to X
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O'){
                    board[i][j] = 'X';
                }
            }
        }

        // change the some other character back to O
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='*'){
                    board[i][j] = 'O';
                }
            }
        }

    }

    private static void bfs(char[][] board, int row, int column){
        if(row < 0 || row >= board.length || column < 0 || column >= board[0].length || board[row][column] != 'O'){
            return;
        }
        board[row][column] = '*';
        bfs(board, row, column-1);
        bfs(board, row, column+1);
        bfs(board, row-1, column);
        bfs(board, row+1, column);
    }

}
