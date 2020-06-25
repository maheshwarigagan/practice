package dynamicProgramming.uniqueBST;

import java.util.HashMap;
import java.util.Map;

public class UniqueBinarySearchTrees {

    static Map<Integer, Integer> map = new HashMap<>();
    public static int numTrees(int n) {
        return helper(n);
    }
    // HELPER
    // base case defined n=1 1 and n=2 return 2
    // remaining n, what's root?
    // left mei kitne hain, right mei kitne hain
    // map, where you will store the solution to different Ns
    // n=4, root =4, remaining 3
    // n=3, ans = 5
    private static int helper(int n){

        if(n==1 || n==2){
            return n;
        }
        if(n==0){
            return 1;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
        int sum = 0;
        for(int i=1;i<=n;i++){
            int leftCount = i-1;
            int rightCount = n-i;
            int total = helper(leftCount) * helper(rightCount);
            sum += total;
        }
        map.put(n, sum);
        return sum;
    }
}
