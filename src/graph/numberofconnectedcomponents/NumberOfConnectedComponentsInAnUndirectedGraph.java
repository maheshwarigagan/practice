package graph.numberofconnectedcomponents;

import java.util.*;

public class NumberOfConnectedComponentsInAnUndirectedGraph {
    public static int countComponents(int n, int[][] edges) {
        if(n<=1){
            return n;
        }

        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(i, new ArrayList<>());
        }

        for(int[] edge:edges){
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }

        Set<Integer> visited = new HashSet<>();
        int count = 0;
        for(int i=0;i<n;i++){
            if(visited.add(i)){
                count++;
                dfsUtil(map, visited, i);
            }
        }

        return count;
    }

    private static void dfsUtil(Map<Integer, List<Integer>>map, Set<Integer> visited, int current){
        for(int i:map.get(current)){
            if(visited.add(i))
                dfsUtil(map, visited, i);
        }
    }

}
