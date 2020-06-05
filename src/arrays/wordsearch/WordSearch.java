package arrays.wordsearch;

public class WordSearch {
    public static boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(exist(board, i, j, word, 0)){
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean exist(char[][] board, int i, int j, String word, int ind){
        //if we have index at the end of word's length that means we have found our match
        if(ind == word.length()){
            return true;
        }
        // check if i and j are valid
        // check if the character at i and j is same as character at word[index]
        if(i > board.length-1 || i <0 || j<0 || j >board[0].length-1 || board[i][j]!=word.charAt(ind))
            return false;
        board[i][j] = '*';

        // iterate over four neighbors
        boolean result = exist(board, i-1, j, word, ind+1) ||
                exist(board, i, j-1, word, ind+1) ||
                exist(board, i, j+1, word, ind+1) ||
                exist(board, i+1, j, word, ind+1);
        board[i][j] = word.charAt(ind);
        //return result of iteration
        return result;
    }

}
