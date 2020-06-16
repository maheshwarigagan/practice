package dfs.courseschedule;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CourseScheduleTest {

    @Test
    public void canFinish() {
        int[][] prerequisites = new int[][]{{1,0},{0,1}};
        Assert.assertFalse(CourseSchedule.canFinish(2, prerequisites));
        prerequisites = new int[][]{{1,0}};
        Assert.assertTrue(CourseSchedule.canFinish(2, prerequisites));
    }
}