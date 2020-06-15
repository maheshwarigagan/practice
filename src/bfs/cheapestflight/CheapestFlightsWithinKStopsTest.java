package bfs.cheapestflight;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheapestFlightsWithinKStopsTest {

    @Test
    public void findCheapestPrice() {
        //n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
        //src = 0, dst = 2, k = 1
        int[][] flights = new int[][] {{0,1,100},{1,2,100},{0,2,500}};
        Assert.assertEquals(200, CheapestFlightsWithinKStops.findCheapestPrice(3, flights, 0, 2, 1));
        Assert.assertEquals(500, CheapestFlightsWithinKStops.findCheapestPrice(3, flights, 0, 2, 0));

    }
}