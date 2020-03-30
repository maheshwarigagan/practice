package arrays.countnumberteams;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountNumberOfTeamsTest {

    @Test
    public void numTeams() {
        Assert.assertEquals(3, CountNumberOfTeams.numTeams(new int[]{2,5,3,4,1}));
    }

    @Test
    public void noTeamsPossible() {
        Assert.assertEquals(0, CountNumberOfTeams.numTeams(new int[]{2,1,3}));
    }
}