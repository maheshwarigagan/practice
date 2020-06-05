package arrays.rotateimage;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotateImageTest {

    @Test
    public void rotate() {
        int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
        RotateImage.rotate(input);
        int[][] expected = {{7,4,1},{8,5,2},{9,6,3}};
        for(int i=0;i<input.length;i++){
            Assert.assertArrayEquals(expected[i], input[i]);
        }
    }
}