package arrays.insertInterval;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        LinkedList<int[]> list = new LinkedList<>();
        boolean inserted = true;
        if(intervals.length > 0){
            for(int[] interval:intervals){
                if(inserted && interval[1]>=newInterval[0]){
                    inserted = false;
                    list.add(interval);
                    list.add(newInterval);
                }else{
                    list.add(interval);
                }
            }
            if(inserted){
                list.add(newInterval);
            }

            return merge(list.toArray(new int[list.size()][]));
        }else{
            list.add(newInterval);
            return merge(list.toArray(new int[list.size()][]));
        }
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[]b){
                return a[0] < b[0] ? -1 : a[0] == b[0] ? 0 : 1;
            }

        });
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
