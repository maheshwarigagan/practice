package arrays.subArraySum;

import java.util.HashMap;
import java.util.Map;
// https://leetcode.com/problems/subarray-sums-divisible-by-k/
public class SubarraySumDivisibleByK {

    public static int subarraysDivByK(int[] A, int K) {

        int count = 0;
        Map<Integer, Integer> remainderMap = new HashMap<>();
        int sum  = 0;
        remainderMap.put(0,1);
        for(int n:A){
            sum = (sum + n)%K;
            if(sum < 0)
                sum += K;
            count += remainderMap.getOrDefault(sum,0);
            remainderMap.put(sum, remainderMap.getOrDefault(sum,0)+1);

        }

        return count;
    }
}
