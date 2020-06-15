package dfs.courseschedule;

import java.util.*;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prereqs) {
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        for(int[] edge:prereqs){
            List<Integer> list = adjList.getOrDefault(edge[0], new ArrayList<>());
            list.add(edge[1]);
            adjList.put(edge[0], list);
        }

        Set<Integer> completedCourse = new HashSet<>();
        for(int i=0;i<numCourses;i++){
            if(completedCourse.contains(i)){
                continue;
            }
            if(!visit(i, adjList, new HashSet<>(), completedCourse)){
                return false;
            }

        }

        return true;
    }

    private boolean visit(int currentCourse
            , Map<Integer, List<Integer>> graph
            , Set<Integer> path
            , Set<Integer> completed){
        if(completed.contains(currentCourse)){
            return true;
        }
        path.add(currentCourse);

        if(graph.containsKey(currentCourse) && graph.get(currentCourse).size() > 0){
            for(int n: graph.get(currentCourse)){
                if(path.contains(n))
                    return false;
                if(!visit(n, graph, path, completed))
                    return false;
            }
        }
        path.remove(currentCourse);
        completed.add(currentCourse);
        return true;
    }

}
