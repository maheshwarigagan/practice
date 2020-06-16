package dfs.courseschedule2;

import dfs.courseschedule.CourseSchedule;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CourseScheduleIITest {

    @Test
    public void findOrder() {
        int[][] prereqs = new int[][]{{1,0},{2,0},{3,1},{3,2}};
        Assert.assertArrayEquals(new int[]{0,1,2,3}, CourseScheduleII.findOrder(4, prereqs));
    }
}