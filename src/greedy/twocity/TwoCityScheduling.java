package greedy.twocity;

import java.util.Arrays;

public class TwoCityScheduling {
    public static int twoCitySchedCost(int[][] costs) {
        int minCost = 0;
        int N = costs.length / 2;
        for (int i = 0; i < 2 * N; i++)
            minCost += costs[i][0]; // get cost to send everyone to city A

        int[] diff = new int[2 * N];
        for (int i = 0; i < 2 * N; i++)
            diff[i] = costs[i][1] - costs[i][0]; // compute the diff of sending B instead of A

        Arrays.sort(diff); // sort the diff Array
        for (int i = 0; i < N; i++)
            minCost += diff[i]; // send first N to city B

        return minCost;
    }
}
