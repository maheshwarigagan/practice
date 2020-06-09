package bfs.pacificatlanticwaterflow;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PacificAtlanticWaterFlowTest {

    @Test
    public void pacificAtlantic() {
        int[][] matrix = new int[][] {{1,2,2,3,5},
                {3,2,3,4,4},
                {2,4,5,3,1},
                {6,7,1,4,5},
                {5,1,1,2,4}};
        List<List<Integer>>  output = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(0);
        temp.add(4);
        output.add(temp);
        temp.clear();
        temp.add(1);
        temp.add(3);
        output.add(temp);
        temp.clear();
        temp.add(1);
        temp.add(4);
        temp.clear();
        temp.add(2);
        temp.add(2);
        temp.clear();
        temp.add(3);
        temp.add(0);
        temp.clear();
        temp.add(3);
        temp.add(1);
        temp.clear();
        temp.add(4);
        temp.add(0);
        assertThat(PacificAtlanticWaterFlow.pacificAtlantic(matrix), CoreMatchers.hasItems(temp));
    }
}