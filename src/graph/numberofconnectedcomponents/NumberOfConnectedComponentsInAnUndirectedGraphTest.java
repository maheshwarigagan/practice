package graph.numberofconnectedcomponents;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfConnectedComponentsInAnUndirectedGraphTest {

    @Test
    public void countComponents() {
        int[][] graph = new int[][]{{0,1},{1,2},{3,4}};
        Assert.assertEquals(2, NumberOfConnectedComponentsInAnUndirectedGraph.countComponents(5, graph));
    }

    @Test
    public void countComponentsSecondTest() {
        int[][] graph = new int[][]{{1,0}};
        Assert.assertEquals(1, NumberOfConnectedComponentsInAnUndirectedGraph.countComponents(2, graph));
    }
}