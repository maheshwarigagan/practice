package arrays.wordsearch;

import com.sun.source.tree.AssertTree;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordSearchTest {

    @Test
    public void exist() {
        char[][] board = {{'A', 'B', 'C', 'E'},
                        {'S', 'F', 'C', 'S'},
                        {'A', 'D', 'E', 'E'}};
        Assert.assertTrue(WordSearch.exist(board, "ABCCED"));
        Assert.assertFalse(WordSearch.exist(board, "ABCB"));
    }
}