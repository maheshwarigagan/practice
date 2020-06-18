package bfs.surroundedregions;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SurroundedRegionsTest {

    @Test
    public void solve() {
        char[][] input = new char[][] {{'X','O','X'},{'O','X','O'},{'X','O','X'}};
        SurroundedRegions.solve(input);
        Assert.assertArrayEquals(new char[]{'X','O','X'}, input[0]);
        Assert.assertArrayEquals(new char[]{'O','X','O'}, input[1]);
        Assert.assertArrayEquals(new char[]{'X','O','X'}, input[2]);
    }
}