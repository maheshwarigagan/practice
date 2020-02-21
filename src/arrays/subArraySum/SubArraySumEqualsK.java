package arrays.subArraySum;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/subarray-sum-equals-k/
public class SubArraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> sumCountMap = new HashMap<>();
        int sum = 0;
        sumCountMap.put(0,1);
        for(int n:nums){
            sum += n;
            if(sumCountMap.containsKey(sum-k)){
                count += sumCountMap.get(sum-k);
            }
            sumCountMap.put(sum, sumCountMap.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
