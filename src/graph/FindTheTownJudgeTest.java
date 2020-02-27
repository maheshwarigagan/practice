package graph;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindTheTownJudgeTest {

    @Test
    public void findJudge() {
        int[][] input =  {{1,2}};
        Assert.assertEquals(2, FindTheTownJudge.findJudge(2,input));
    }

    @Test
    public void findJudgeWithMultipleVotesFromUser(){
//        Input: N = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]
//        Output: 3
        int[][] input =  {{1,3},{1,4},{2,3},{2,4},{4,3}};
        Assert.assertEquals(3, FindTheTownJudge.findJudge(4,input));
    }

    @Test
    public void noJudgeTest(){
//        Input: N = 3, trust = [[1,2],[2,3]]
//        Output: -1
        int[][] input =  {{1,2},{2,3}};
        Assert.assertEquals(-1, FindTheTownJudge.findJudge(3,input));

    }
}