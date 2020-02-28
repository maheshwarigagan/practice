package arrays.mergeInterval;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] < b[0] ? -1 : a[0] == b[0] ? 0 : 1);
        LinkedList<int[]> mergedList = new LinkedList<>();
        for(int i=0;i<intervals.length;i++){
            // end time of previous interval is less than or equal to my current start time
            if(mergedList.isEmpty() || mergedList.getLast()[1] < intervals[i][0]){
                mergedList.add(intervals[i]);
            }else{
                mergedList.getLast()[1] = Math.max(mergedList.getLast()[1],intervals[i][1]);
            }

        }
        return mergedList.toArray(new int[mergedList.size()][]);
    }
}
