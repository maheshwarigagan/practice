package arrays.thirdmaxno;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Set<Integer> seen = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for(int n:nums){
            if(seen.contains(n)){
                continue;
            }
            pq.add(n);
            if(pq.size()>3){
                pq.poll();
            }
            max = Math.max(max,n);
            seen.add(n);
        }
        if(pq.size() == 3){
            return pq.poll();
        }else{
            return max;
        }
    }
}
