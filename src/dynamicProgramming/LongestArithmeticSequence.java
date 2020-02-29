package dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class LongestArithmeticSequence {
    public static int longestArithSeqLength(int[] A) {
        int n = A.length;
        Map<Integer, Integer>[] dp = new HashMap[n];
        int longest = 0;
        for(int i=0;i<n;i++){
            dp[i] = new HashMap<Integer, Integer>();
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                int prev = dp[j].getOrDefault(A[j]-A[i],1);
                dp[i].put(A[j]-A[i], prev+1);
                longest = Math.max(longest, prev+1);
            }
        }
        return longest;
    }
}
