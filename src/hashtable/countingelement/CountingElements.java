package hashtable.countingelement;

import java.util.HashSet;
import java.util.Set;

public class CountingElements {
    public static int countElements(int[] arr) {
        // Map<Integer, Integer> countMap = new HashMap<>();
        Set<Integer> countSet = new HashSet<>();
        int count = 0;

        for(int n: arr){
            countSet.add(n);
        }
        for(int n:arr){
            if(countSet.contains(n+1))
                count++;
        }

        return count;
    }
}
