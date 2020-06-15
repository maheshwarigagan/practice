package bfs.cheapestflight;

import java.util.*;

public class CheapestFlightsWithinKStops {
    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int[] flight:flights){
            List<Integer> entry = graph.getOrDefault(flight[0], new ArrayList<>());
            //neighbor
            entry.add(flight[1]);
            // cost
            entry.add(flight[2]);

            graph.put(flight[0], entry);
        }

        // Queue<Integer> q = new LinkedList<>();
        // q.offer(src);
        // q.offer(0);
        // q.offer(0);
        Queue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        q.offer(new int[]{src, 0, 0});
        while(q.size() > 0){
            int[] a = q.poll();
            int current = a[0];
            int cost = a[1];
            int hops = a[2];

            if(current == dst){
                return cost;
            }

            // iterate neighbors
            List<Integer> nodeAndCost = graph.getOrDefault(current, new ArrayList<>());
            for(int i=0;i<nodeAndCost.size()-1;i+=2){
                // hops should be less than K
                if(hops <= K){
                    q.offer(new int[] {nodeAndCost.get(i),cost + nodeAndCost.get(i+1), hops + 1});
                }
            }

        }

        return -1;
    }

}
